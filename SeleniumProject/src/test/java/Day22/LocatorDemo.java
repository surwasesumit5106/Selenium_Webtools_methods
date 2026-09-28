package Day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("search")).sendKeys("Test ann");
		
		//Id
		boolean logodisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logodisplaystatus);
		
		
		//linktext and partiallinktext
		//linktext is available only for link and innertext is available for other than link
		// to locate the uniqe element use linktext
		
		driver.findElement(By.linkText("Tablets")).click();
		driver.findElement(By.linkText("Qafox.com")).click();
		
		//partiallinktext no need to pass complete value of text we can pass potion of text
		//driver.findElement(By.partialLinkText("Table")).click();
		
		
		//tagname returns multiple webelements
		List<WebElement>nooflinks=driver.findElements(By.tagName("a"));
		System.out.println(nooflinks.size());
		
		//classname .size returns the integer so we can take that in to the int variable as well
		int noofheader=driver.findElements(By.xpath("//ul[@class='list-inline']/li")).size();
		System.out.println(noofheader);
		
		driver.quit();
		
		
		
		
	}

}
