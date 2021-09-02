package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cssSelectorDemos {
	WebDriver driver;

	@BeforeTest
	public void start() {
		System.setProperty("webdriver.chrome.driver", "B:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/css-selector.html");

	}

	@Test
	public void ImmediateElement() throws Throwable {

		WebElement text = driver.findElement(By.cssSelector("div[id*='123_randomId']+div"));
		String elementText = text.getText();
		System.out.println("Get Immediate Element Text Using CSS Selector: " + elementText);
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void SelectLastChild() throws InterruptedException {

		WebElement text = driver.findElement(By.cssSelector("#browsers li:last-child"));
		String elementText = text.getText();
		System.out.println("Get Last Child Element Text Using CSS Selector: " + elementText);
		Thread.sleep(2000);
	}

	@Test
	public void SelectDirectChildBasedOnIndex() throws Throwable {

		WebElement text = driver.findElement(By.cssSelector("#browsers li:nth-child(2)"));
		String elementText = text.getText();
		System.out.println("Get 2nd Child Element Text Using CSS Selector: " + elementText);
		Thread.sleep(2000);
	}
	
	@Test
	public void SelectDirectChildOrGrandChild() throws Throwable {

		WebElement text = driver.findElement(By.cssSelector("ul#browsers  li"));
		String elementText = text.getText();
		System.out.println("Get Child Element Text Using CSS Selector: " + elementText);
		Thread.sleep(2000);
	}
	
	

	@AfterTest
	public void quit() {
		driver.close();
	}
}
