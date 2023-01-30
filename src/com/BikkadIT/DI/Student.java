package com.BikkadIT.DI;

public class Student {

	int rollno;

	String sname;

	String saddress;

	public Student(int rollno, String sname, String saddress) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.saddress = saddress;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", saddress=" + saddress + "]";
	}

	


}
