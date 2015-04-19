package com.dpl.authenticatedUser;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "authenticatedUser")
@ViewScoped
public class AuthenticatedUser implements Serializable
{
	private static final long serialVersionUID = 2455816720678921431L;
	
	private String username;
	private String email;
	private String name;
	
	private boolean authenticated = false;
	
	public AuthenticatedUser()
	{
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}

	public String getUsername() {
		System.out.println("USERNAME: " + username);
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
