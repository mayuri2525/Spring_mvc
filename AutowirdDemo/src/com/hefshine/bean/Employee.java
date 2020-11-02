package com.hefshine.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private String name;
	private Address add;

	public Employee() {

	}

	public Employee(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;

		System.out.println("parameter constuctor");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
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

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public void work() {
		System.out.println("Emp id is:" + id + "  " + "Name is:" + name + " " + add);

		add.display();
	}

}
