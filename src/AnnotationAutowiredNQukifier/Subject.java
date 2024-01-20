package AnnotationAutowiredNQukifier;

public class Subject {
	String subjectname;

	@Override
	public String toString() {
		return "Subject [subjectname=" + subjectname + "]";
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
}
