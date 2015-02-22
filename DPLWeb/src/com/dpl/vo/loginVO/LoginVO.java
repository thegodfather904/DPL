package com.dpl.vo.loginVO;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class LoginVO implements Serializable
{
	private static final long serialVersionUID = 6893892963898585571L;
	
	private String username;
	private String password;
	
	public LoginVO()
	{
		
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
}
