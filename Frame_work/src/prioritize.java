import org.testng.annotations.Test;

public class prioritize {
	
	
@Test(priority=1)
public void login(){
	System.out.println("log in test");
	check c = new check();
	c.dologin();
	
}
@Test(priority=2)

public void friendlist(){
	System.out.println("checking friendlist");
}
@Test(priority=3)
public void group(){
	System.out.println("checking group");
}
@Test(priority=4)
public void crises_responses(){
	System.out.println("checking what crises could happen");
}
}
