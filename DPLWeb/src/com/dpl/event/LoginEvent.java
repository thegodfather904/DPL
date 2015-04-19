package com.dpl.event;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.dpl.authenticatedUser.AuthenticatedUser;

@ManagedBean
@RequestScoped
public class LoginEvent implements Serializable
{
	private static final long serialVersionUID = -9133713219432742258L;
	
	public LoginEvent()
	{
		
	}
	
	public boolean authenticateUser(AuthenticatedUser authenticatedUser, String username, String password)
	{
		boolean isAuthenticated = false;
		
		//db call will go here
		if(username.equals("username") && password.equals("password"))
		{
			isAuthenticated = true;
			authenticatedUser.setUsername("TheGodfather904");
			authenticatedUser.setName("Tony Scialo");
		}
		
		return isAuthenticated;
		
	}
	
}
