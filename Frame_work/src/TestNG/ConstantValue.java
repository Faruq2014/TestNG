package TestNG;

public class ConstantValue {
	
	public static final String FIREFOX_DRIVER_EXE= System.getProperty("user.dir")+ "//src/test/resources//driver//geckcodriver.exe";	
	public static final String CHROME_DRIVER_EXE = System.getProperty("user.dir") + "//src//test//resources//driver//chromedriver.exe";		
	public static final String IE_DRIVER_EXE= System.getProperty("user.dir")+ "//src//test/resources//driver//IEDriverServer.exe";			
	public static final String REPORTS_PATH = System.getProperty("user.dir") +"//src//test//resources//reports//";	

	public static final String LOGIN_USERNAME ="//*[@id='email']";
	public static final String LOGIN_PASSWORD ="//*[@id='pass']";
	public static final String PROFILE_LINKPAGE ="//*[@id='pagelet_welcome_box']/ul/li[1]/div/a";

	public static final String PROD_HOMEPAGE_URL ="http://facebook.com";
	public static final String PROD_USERNAME ="mjmolla@gmail.com";
	public static final String PROD_PASSWORD ="faruq8205";

	public static final String UAT_HOMEPAGE_URL="http://uat.facebook.com";
	public static final String UAT_USERNAME="uat_mj@gmail.com";
	public static final String UAT_LINKPAGE="uat_faruq8205";


	public static final String ENV="PROD"; //PROD, UAT,SAT 


}
