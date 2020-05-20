package com.ealves.model;

public class Client {
	
	private Integer id;

	private String name;

	private Integer age;

	private String email;

	private boolean active;

	private CurrentAccount account;

	public Client(Integer id, String name, Integer age, String email, boolean active, CurrentAccount account) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.active = active;
		this.account = account;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public CurrentAccount getAccount() {
		return account;
	}

	public void setAccount(CurrentAccount account) {
		this.account = account;
	}

	
	@Override
	public String toString() {
		
		String str ="=========================\n"
					+"Id: " + this.id + "\n"
					+ "Name: " + this.name + "\n"
					+ "Email: " + this.email + "\n"
					+ "Age: " + this.age + "\n"
					+ "Status: " + (active?"Active":"Inactive") + "\n"
					+ "Account: " + this.account.getId() + "\n"
					+ "=========================";
		return str;
	}

}
