
package com.security.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "bank")
public class Bank {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int mobilenumber;
	private String address;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", mobilenumber=" + mobilenumber + ", address=" + address + "]";
	}
}