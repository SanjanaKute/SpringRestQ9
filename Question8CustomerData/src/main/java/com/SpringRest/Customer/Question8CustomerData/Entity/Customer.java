package com.SpringRest.Customer.Question8CustomerData.Entity;

public class Customer {
	
	private int id;
	private String name;
	private String address;
	private long contactNo;
	public Customer(int id, String name, String address, long contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", contactNo=" + contactNo + "]";
	}
	
	

}
