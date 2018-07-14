package testngExplanation;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups={"smoke"})
		public void login(){
			System.out.println("log in test");
		}
	
	@Test(groups={"smoke"})
	
	public void friendlist(){
		System.out.println("checking friendlist");
	}
	@Test(groups={"smoke"})
	public void group(){
		System.out.println("checking group");
	}
	@Test(groups={"smoke"})
	public void crises_responses(){
		System.out.println("checking what crises could happen");
	}
	
	@Test(groups={"smoke"})
	public void crises_manage(){
		System.out.println("checking how to manage crises");
	}
	@Test(groups={"smoke"})
	public void crises_controll(){
		System.out.println("checking is there any controll");
	}
	

}
