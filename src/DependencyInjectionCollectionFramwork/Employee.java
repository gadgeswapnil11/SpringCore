package DependencyInjectionCollectionFramwork;

import java.util.*;

public class Employee {
	@Override
	public String toString() {
		return "Employee [intlist=" + intlist + ", namesset=" + namesset + ", pairsmap=" + pairsmap + ", id=" + id
				+ ", name=" + name + "]";
	}

	private List<Integer> intlist;
	private Set<String> namesset;
	private Map<String, Integer> pairsmap;
	private int id;
	private String name;

	public Employee() {
		System.out.println("Inside Constructor");
	}

	public List<Integer> getIntlist() {
		return intlist;
	}

	public void setIntlist(List<Integer> intlist) {
		this.intlist = intlist;
	}

	public Set<String> getNamesset() {
		return namesset;
	}

	public void setNamesset(Set<String> namesset) {
		this.namesset = namesset;
	}

	public Map<String, Integer> getPairsmap() {
		return pairsmap;
	}

	public void setPairsmap(Map<String, Integer> pairsmap) {
		this.pairsmap = pairsmap;
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


	

}
