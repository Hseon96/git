package com.sist.user;
import java.util.*;
import com.sist.dao.*;
public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpDAO dao=new EmpDAO();
		ArrayList<Emp> list=dao.empListData();
		for(Emp e:list)
		{
			System.out.println(e.getEmpno()+" "
					+e.getEname()+" "
					+e.getJob()+" "
					+e.getHiredate().toString()+" "
					+e.getSal()+" "
					+e.getComm());
		}
 }
}
