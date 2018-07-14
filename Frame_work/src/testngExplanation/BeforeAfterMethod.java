package testngExplanation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeAfterMethod {
	@BeforeMethod(description="connect to database")

	public void beforemethod() throws SQLException{

	//check database connection is up
	String databaseurl = "jdbc:oracle://192.168.1.258/myDB";
	DriverManager.getConnection(databaseurl, "username", "password");
	}
	
	@AfterMethod(description="close database connection")

	public void aftermethod() throws SQLException{
	//check database connection is closed
	String databaseurl = "jdbc:oracle://192.168.1.258/myDB";
	Connection connect = DriverManager.getConnection(databaseurl, "username", "password");

	if(connect!=null)
	connect.close();
	}

}
