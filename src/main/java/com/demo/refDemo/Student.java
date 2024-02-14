package com.demo.refDemo;

import java.util.List;
import java.util.Set;

public class Student {
	
	private int id;
	private String name;
	private Address address;
	private List<String> subject;
	private Set<Integer> rollNo;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Address address, List<String> subject, Set<Integer> rollNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.subject = subject;
		this.rollNo = rollNo;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	
	
	
	public Set<Integer> getRollNo() {
		return rollNo;
	}
	public void setRollNo(Set<Integer> rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", subject=" + subject + ", rollNo="
				+ rollNo + "]";
	}
	
	

}
