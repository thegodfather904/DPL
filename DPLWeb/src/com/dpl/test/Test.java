package com.dpl.test;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Test implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3792739811348009771L;
	
	private String testString = "This is a test";
	
	public Test()
	{
		
	}

	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}
}
