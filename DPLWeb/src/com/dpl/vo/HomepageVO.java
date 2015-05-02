package com.dpl.vo;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedProperty;
import javax.annotation.PostConstruct;

@ManagedBean
@ViewScoped
public class HomepageVO implements Serializable
{

	private static final long serialVersionUID = -6146998913559247790L;
	
	//user session bean
	@ManagedProperty("#{loginVO}")
	private LoginVO login;
	
	private String name;
	
	public HomepageVO()
	{

	}

	@PostConstruct
	public void init()
	{
		name = login.getUserSession().getName();
		System.out.println(login.getUserSession().getName());
		System.out.println(login.getUserSession().getUsername());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLogin(LoginVO login)
	{
		this.login = login;
	}
	
	public LoginVO getLogin()
	{
		return login;
	}
	
}
