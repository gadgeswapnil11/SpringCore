package AnnotationAutowiredNQukifier;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	String id;
	@Autowired
	Department dept;
	
	@Autowired
	Address addr;
	@Override
	public String toString() {
		return "Student [id=" + id + ", dept=" + dept + ", addr=" + addr + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}

}
