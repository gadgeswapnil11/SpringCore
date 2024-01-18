package Annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class States {

	String satate;
	String dist;
	@Autowired
	Subdist subdist;
	
	
	@Override
	public String toString() {
		return "States [satate=" + satate + ", dist=" + dist + ", subdist=" + subdist + "]";
	}
	public String getSatate() {
		return satate;
	}
	public void setSatate(String satate) {
		this.satate = satate;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public Subdist getSubdist() {
		return subdist;
	}
	public void setSubdist(Subdist subdist) {
		this.subdist = subdist;
	}
	
}
