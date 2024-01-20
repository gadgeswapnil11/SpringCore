package AnnotationAutowiredNQukifier;

public class State {
	String stateName;

	public String getStateName() {
		return stateName;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + "]";
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
}
