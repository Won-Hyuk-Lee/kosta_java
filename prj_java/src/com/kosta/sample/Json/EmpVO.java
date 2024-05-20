package com.kosta.sample.Json;

public class EmpVO {

	private int empno;
	private String ename;
	private int sal;
	// 마우스 우클릭 - source - generate getter and setter
	
	public EmpVO() {}

	public EmpVO(int empno, String ename, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "EmpVO [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}

	public int getEmpno() {
		return this.empno;
	}

	public void setEmpno(int no) {
		this.empno = no;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String name) {
		this.ename = name;
	}

	public int getSal() {
		return this.sal;
	}

	public void setSal(int no) {
		this.sal = no;
	}

}
