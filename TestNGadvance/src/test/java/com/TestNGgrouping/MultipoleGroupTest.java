package com.TestNGgrouping;

import org.testng.annotations.Test;

@Test(groups={"Status","Login"})

public class MultipoleGroupTest {

	
	@Test(groups={"smoke"})
	public void login(){
		System.out.println("log in test");
	}

@Test(groups={"functional"})

public void friendlist(){
	System.out.println("checking friendlist");
}
@Test(groups={"smoke","functional"})
public void group(){
	System.out.println("checking group");
}
@Test(groups={"Regression"})
public void crises_responses(){
	System.out.println("checking what crises could happen");
}

@Test(groups={"smoke"})
public void crises_manage(){
	System.out.println("checking how to manage crises");
}
@Test(groups={"functional","Regression"})
public void crises_controll(){
	System.out.println("checking is there any controll");
}



}
