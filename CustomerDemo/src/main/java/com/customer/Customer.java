package com.customer;

public class Customer {
   
	private int  cusId;
    private String name;
    private String email;
    private String username;
    private String password;
    
 public Customer(int cusId, String name, String email, String username, String password) {
		
		this.cusId = cusId;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
  }

public int getCusId() {
	return cusId;
}

public String getName() {
	return name;
}


public String getEmail() {
	return email;
}


public String getUsername() {
	return username;
}


public String getPassword() {
	return password;
}
}
