package com.TestNGgrouping;

import org.testng.annotations.Test;
@Test(groups={"Messanger","Status"})
public class RegularExpression {

	
	@Test(groups={"LogIn.smoke"})
	public void login(){
		System.out.println("LogIn.smoke");
	}

@Test(groups={"LogIn.functional"})

public void friendlist(){
	System.out.println("LogIn.functional");
}
@Test(groups={"smoke","Status.functional"})
public void group(){
	System.out.println("smoke"+"Status.functional");
}
@Test(groups={"LogIn.Regression"})
public void crises_responses(){
	System.out.println("LogIn.Regression");
}

@Test(groups={"Status.smoke"})
public void crises_manage(){
	System.out.println("Status.smoke");
}
@Test(groups={"Status.functional","Regression"})
public void crises_controll(){
	System.out.println("Status.functional"+"Regression");
}



}
