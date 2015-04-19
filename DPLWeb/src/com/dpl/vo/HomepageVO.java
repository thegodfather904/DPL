package com.dpl.vo;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedProperty;
import javax.annotation.PostConstruct;

import com.dpl.authenticatedUser.AuthenticatedUser;

@ManagedBean
@ViewScoped
public class HomepageVO implements Serializable
{

	private static final long serialVersionUID = -6146998913559247790L;
	
	//Authenticated User Bean
		@ManagedProperty("#{authenticatedUser}")
		private AuthenticatedUser authenticatedUser;
	
	private String name = "TEST";
	
	public HomepageVO()
	{

	}

	@PostConstruct
	public void init()
	{
		name = authenticatedUser.getName();
		System.out.println(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AuthenticatedUser getAuthenticatedUser()
	{
		return authenticatedUser;
	}
	
	public void setAuthenticatedUser(AuthenticatedUser authenticatedUser)
	{
		this.authenticatedUser = authenticatedUser;
	}
	
	
}
