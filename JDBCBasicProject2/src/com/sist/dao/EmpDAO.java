package com.sist.dao;
import java.util.*;// ArrayList
import java.sql.*; //����Ŭ ����
public class EmpDAO {
	// ����Ŭ ���� ��ü
	private Connection conn;
	// SQL���� ����
	private PreparedStatement ps;
	// ���� => URL(����Ŭ ���� �ּ�)�� ����Ǹ� �ȵǴϱ� final
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	//                         jdbc:mysql://localhost:3306/mydb?serverTimezone..~~
	// 1. ����̹� ���
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch(Exception ex) {}
	}
	// 2. ����Ŭ ����
	public void getConnection()
	{
	  try
	  {
		  conn=DriverManager.getConnection(URL,"hr","happy");
	  }catch(Exception ex){}
	  
	}
	// 3. ����Ŭ �ݱ�
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			//exit
		}catch(Exception ex) {}
	}
	// 4. ���
	
	// 4-1. ��� ��� ==> NVL ==> Emp (14)
	// Ŭ������ �Ѹ�,�Ѱ��� ���� ���� ==> new ==> ��Ƽ� ���� => List
	public ArrayList<Emp> empListData()
	{
		ArrayList<Emp> list=new ArrayList<Emp>();
		try
		{
			// 1.����
			getConnection();
			// 2. SQL������ ����� 
            String sql="SELECT empno,ename,job,hiredate,sal,NVL(comm,0) "
            		+"FROM emp";
            //3. ����Ŭ ����
            ps=conn.prepareStatement(sql);
            //4. ����� �ޱ�
            ResultSet rs=ps.executeQuery();
            while(rs.next()) //ó������ ����������
            {
            	Emp emp=new Emp();
            	emp.setEmpno(rs.getInt(1));
            	emp.setEname(rs.getString(2));
            	emp.setJob(rs.getString(3));
            	emp.setHiredate(rs.getDate(4));
            	emp.setSal(rs.getInt(5));
            	emp.setComm(rs.getInt(6));
            	
            	list.add(emp);
            }
            rs.close();
		}catch(Exception ex){
			//���� ó��
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	// 4-2. �󼼺��� ==> WHERE
	
	// 4-3. �˻� ==> LIKE
	
	
	
	
}
