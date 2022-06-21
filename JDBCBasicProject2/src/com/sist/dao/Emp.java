package com.sist.dao;
/*
 *     ����Ŭ ��������
 *     ������
 *     		CHAR(1~2000byte) => ����
 *     		CHAR(10) ==> aaa ==> �޸𸮴� 10byte
 *     		VARCHAR2(1~4000byte) => ����
 *     		VARCHAR2(4000) == aaa => �޸� 3byte ����
 *     		=> �ѱ� ����Ʈ => 3byte 
 *     		CLOB => 4�Ⱑ => ������(���ü��ִ¸�ŭ)
 *     		------------------------------------------- �ڹ� ��Ī (String) 
 *     ������
 *     		NUMBER(4) �⺻ 8�ڸ�
 *     		NUMBER(7,2) => ����/�Ǽ� �Ѵ� �ɼ� �ִ�
 *     		---------------------------------int / double
 *     ��¥�� 
 *     		DATE ==> java.util.Date
 *     ��Ÿ��
 *     		BLOB
 *     		BFILE ===> InputStream
 *     		
 */
import java.util.*;
public class Emp {
    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private Date hiredate;
    private int sal;
    private int comm;
    private int deptno;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
    
}
