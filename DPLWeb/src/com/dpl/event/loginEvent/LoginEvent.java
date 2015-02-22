package com.dpl.event.loginEvent;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class LoginEvent implements Serializable
{
	private static final long serialVersionUID = -9133713219432742258L;

	public LoginEvent()
	{
		
	}
	
	public void authenticateUser()
	{
		System.out.println("HERE");
	}
	
}
