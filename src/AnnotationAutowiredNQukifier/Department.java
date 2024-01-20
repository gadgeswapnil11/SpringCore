package AnnotationAutowiredNQukifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Department {

	String deptname;
	@Autowired
	@Qualifier(value = "sub2")  
	Subject sub;
	@Override
	public String toString() {
		return "Department [deptname=" + deptname + "]";
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
}
