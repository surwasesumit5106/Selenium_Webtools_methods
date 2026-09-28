package Day21;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTestselenium {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		if(title.equals("Your Store"))
		{
			System.out.println("Test Pass");
		}
		
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.quit();
	}

}
