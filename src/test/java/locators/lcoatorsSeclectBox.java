package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lcoatorsSeclectBox {
	WebDriver driver;

	@BeforeTest
	public void start() {
		System.setProperty("webdriver.chrome.driver", "B:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/radio.html");

	}

	@Test
	public void chck_buttons() throws InterruptedException {
		
		//locate radio button
		List<WebElement> buttons=driver.findElements(By.cssSelector("div > input"));
		System.out.println(" Count of buttons "+ buttons.size());
		/*
		for(int i=0;i<buttons.size();i++) {
			System.out.println(buttons.get(i).getAttribute("value"));
		}
		
		*/
		List<WebElement> radiobuttons=driver.findElements(By.cssSelector("div > input[type='radio']"));
		System.out.println("Count of radio buttons"+ radiobuttons.size());
		/*
		for(int i=0;i<radiobuttons.size();i++) {
			System.out.println(radiobuttons.get(i).getAttribute("value"));
		}
		*/
		
	}
	
	
	@Test
	public void radioButton() {
		
		WebElement radiobtn1=driver.findElement(By.cssSelector("div > input[id='vfb-7-1']"));
		WebElement radiobtn2=driver.findElement(By.cssSelector("div > input[id='vfb-7-2']:checked"));
		System.out.println(radiobtn2 + "-------------");
		
		WebElement radiobtn3=driver.findElement(By.cssSelector("div > input[id='vfb-7-3']"));
		
		System.out.println("radio button displayed " + radiobtn1.isDisplayed());
		System.out.println("radio button is enabled "+ radiobtn1.isEnabled());
		if((radiobtn1.isEnabled())==true) {
			radiobtn1.click();
		System.out.println("radio button is toggled on "+ radiobtn1.isSelected());
	}
		else
			{System.out.println("Button is toggled off");
			}
			}
	
	
	

	@AfterTest
	public void quit() {
		driver.close();
	}
}
