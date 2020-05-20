package com.ealves.model;

public class CurrentAccount {

	private Integer id;

	private double balance;

	private boolean active;

	public CurrentAccount(Integer id, double balance, boolean active) {
		super();
		this.id = id;
		this.balance = balance;
		this.active = active;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
