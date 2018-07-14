package TestNG;

import org.testng.annotations.Test;

public class Group {
@Test(groups={"smoke","regression"})
public void checkingGroup(){
	System.out.println("this class from TestNG package");
	
}
@Test
public void checkingNotGroup(){
	System.out.println("this class from TestNG package");
	
}
}
