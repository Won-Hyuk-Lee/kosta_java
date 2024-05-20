package com.kosta.sample.json;

public class EmpVO {
	//프로퍼티(property) --> 값을 다루는 변수(파란색 변수)
	private int empno;
	private String ename;
	private int sal;
	
	public EmpVO() { }
	
	//마우스우클릭>source>Generate constructor using fields ..
	public EmpVO(int empno, String ename, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	
	//마우스우클릭>source>Generate getter and setter ..
	public int getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public int getSal() {
		return sal;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	//Object toString()을 오버라이딩
	@Override
	public String toString() {
		return "EmpVO [empno=" + this.empno + ", ename=" + this.ename + ", sal=" + sal + "]";
	}
	
	
	
	
//	public String getEname() {
//		return this.ename;
//	}
//	
//	public void setEname(String prmEname){
//		this.ename = prmEname;
//	}
//	public int getEmpno() {
//		return this.empno;
//	}
//	public void setEmpno(int prmEmpno) {
//		this.empno = prmEmpno;
//	}
}
