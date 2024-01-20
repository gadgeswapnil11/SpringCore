package Annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Dist {
	public String getDistName() {
		return distName;
	}

	public void setDistName(String distName) {
		this.distName = distName;
	}

	private String distName;
	
	
	public Dist(){
		
		System.out.println("Inside Dist");
		
	}
	
	@Autowired
	@Qualifier(value="subdist1")
	private Subdist subDist;
	


	
	public Subdist getSubDist() {
		return subDist;
	}

	public void setSubDist(Subdist subDist) {
		this.subDist = subDist;
	}





	
	

@Override
public String toString() {
	return "Dist [distName=" + distName + ", subDist=" + subDist + "]";
}
	
}
