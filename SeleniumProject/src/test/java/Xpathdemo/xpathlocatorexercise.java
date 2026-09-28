package Xpathdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocatorexercise {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("dhfbdf");
		
		//xpath with multiple attribute
		driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("hdbfhdbfd");
		
		//xpath with and and or operators
		
		driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("/////////");
		driver.findElement(By.xpath("//input[@placeholder='Search' or @name='search']")).sendKeys("86887");
		
		//xpath with innertext
		driver.findElement(By.xpath("//a[text()='Desktops']")).click();
		
		//xpath with contains method
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("contains method");
		
		//xpath with contains text methos
		driver.findElement(By.xpath("//a[contains(text(),'Desktops')]")).click();
		
		//xpath with starts with
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]")).sendKeys("Starts with method");
	
		//chained xpath
		driver.findElement(By.xpath("//div[@id='logo']/h1/a")).click();
		
		driver.quit();
		
		
	}

}
