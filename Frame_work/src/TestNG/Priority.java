package TestNG;
import org.testng.annotations.Test;

public class Priority {
	
	
@Test(priority=1)
public void login(){
	System.out.println("log in test");
	
}
@Test(priority=4)

public void friendlist(){
	System.out.println("checking friendlist");
}
@Test(priority=3)
public void group(){
	System.out.println("checking group");
}
@Test(priority=2)
public void crises_responses(){
	System.out.println("checking what crises could happen");
}

@Test(priority=5)
public void crises_manage(){
	System.out.println("checking how to manage crises");
}
@Test(priority=6)
public void crises_controll(){
	System.out.println("checking is there any controll");
}

}
