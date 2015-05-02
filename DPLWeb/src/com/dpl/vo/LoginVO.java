package com.dpl.vo;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.annotation.PostConstruct;

import com.dpl.authenticatedUser.AuthenticatedUser;
import com.dpl.event.LoginEvent;

@ManagedBean
@SessionScoped
public class LoginVO implements Serializable
{
	private static final long serialVersionUID = 6893892963898585571L;
	
	/*Username and password entered by the user*/
	private String username;
	private String password;
	
	private AuthenticatedUser userSession;
	
	public LoginVO()
	{
		
	}
	
	@PostConstruct
	public void init()
	{
		//create a new user session
		userSession = new AuthenticatedUser();
	}
	
	/*Verifies username and password*/
	public String authenticateUser()
	{
		LoginEvent event = new LoginEvent();
		boolean isAuthenticated = event.authenticateUser(userSession, username, password);
		
		if(isAuthenticated)
		{
			//dont want to store there password in session
			password = "";
			
			return "home";
		}
		else
			return "";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AuthenticatedUser getUserSession() {
		return userSession;
	}

	public void setUserSession(AuthenticatedUser userSession) {
		this.userSession = userSession;
	}
	
//	public AuthenticatedUser getAuthenticatedUser()
//	{
//		return authenticatedUser;
//	}
//	
//	public void setAuthenticatedUser(AuthenticatedUser authenticatedUser)
//	{
//		this.authenticatedUser = authenticatedUser;
//	}
	
	
}
