package DependencyInjectionCollectionFramwork;

import java.util.*;

public class Employee {

	
	public Employee() {
		System.out.println("Inside Constructor");
	}
	
	
	private int id;
	private String name;

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

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	private List<Integer> list;
	private Set<String> set;
	private Map<String, Integer> map;

}
