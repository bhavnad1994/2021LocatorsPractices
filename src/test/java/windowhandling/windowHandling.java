package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "B:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		String mainWind=driver.getWindowHandle();
		driver.findElement(By.xpath("//div/a[contains(text(),'Try it Yourself')][1]")).click();
		Set<String>allWinds=driver.getWindowHandles();
		
	}

}
