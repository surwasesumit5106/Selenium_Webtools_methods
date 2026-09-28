package TestNGDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
login ---------------@BeforeMethod
search --------------@Test
logout --------------@AfterMethod
login
adv search
logout
*/
public class TestNgAnnotations {
	
	@BeforeMethod 
	void Login()
	{
		System.out.println("Login");
	}
	
	@Test
	void search()
	{
		System.out.println("Search is going");
	}
	@Test
	void advSearch()
	{
		System.out.println("advSearch");
	}
	
	@AfterMethod
	void Logout()
	{
		System.out.println("logout");
	}
}
