package com.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "amount", nullable = false)
	private double amount;
	@Column(name = "catagory", nullable = false)
	private String catagory;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public Ticket() {
	}

	public Ticket(int id, double amount, String catagory) {
		super();
		this.id = id;
		this.amount = amount;
		this.catagory = catagory;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", amount=" + amount + ", catagory=" + catagory + "]";
	}
}
