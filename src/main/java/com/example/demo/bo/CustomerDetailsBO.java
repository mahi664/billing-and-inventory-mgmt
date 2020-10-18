package com.example.demo.bo;

public class CustomerDetailsBO {
	private 	String						customerId;
	private		String						customerName;
	private		String						phone;
	private 	String 						address;
	private 	String 						email;
	private 	int 						gstNo;
	


	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getGstNo() {
		return gstNo;
	}

	public void setGstNo(int gstNo) {
		this.gstNo = gstNo;
	}
	
	
}
