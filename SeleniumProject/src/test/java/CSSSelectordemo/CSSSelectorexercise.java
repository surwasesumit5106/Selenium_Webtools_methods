package CSSSelectordemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorexercise {
	
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.manage().window().maximize();
		
		//tag Id
		driver.findElement(By.cssSelector("#cart")).click();
		
		//tag classname
		driver.findElement(By.cssSelector(".form-control")).sendKeys("yy");
		
		//tag[attribute=value]
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("II");
		
		//tag.classname[attribute=value]
		//driver.findElement(By.cssSelector("input.form-control[name='search']")).sendKeys("hbbhdsvchsdvc");
		driver.findElement(By.cssSelector(".form-control[name='search']")).sendKeys("hbbhdsvchsdvc");
		
		//driver.quit();
		
		
		
		
		
		
	}
	

}
