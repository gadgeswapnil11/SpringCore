package Annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class State {
	private String stateName;
	public State(){
		System.out.println("Inside State");
	}
	
	@Autowired
	@Qualifier(value="dist1")
	private Dist dist;
	public String getStateName() {
		return stateName;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", dist=" + dist + "]";
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Dist getDist() {
		return dist;
	}
	public void setDist(Dist dist) {
		this.dist = dist;
	}

}
