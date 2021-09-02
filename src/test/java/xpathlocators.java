import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocators {

	public static void main(String[] args) {

/*
 * XPath=//tagname[@attribute='value']
// : Select current node.
Tagname: Tagname of the particular node.
@: Select attribute.
Attribute: Attribute name of the node.
Value: Value of the attribute.
 * 
 * 
 * 
 */

		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();	
		driver.get("https://demo.opencart.com/index.php?route=account/register");
			
		/*
		 * Contains():
           Contains() is a method used in XPath expression. 
           It is used when the value of any attribute changes dynamically, for example, login information.
          The contain feature has an ability to find the element with partial text 
		 * 
		 */
		System.out.println("using contains() axes");
		List<WebElement> containsContainer=driver.findElements(By.xpath("//*[contains(@id,'input-')]"));
		System.out.println(containsContainer.size());
		for(int i=0;i<containsContainer.size();i++) {
			String element_attribute=containsContainer.get(i).getAttribute("id");
			System.out.println(element_attribute);
			
		}
		
		 
			
		/*
		 * XPath starts-with() is a function used for finding the web element whose attribute value gets changed on refresh 
		 * or by other dynamic operations on 
		 * the webpage. In this method, the starting text of the attribute is 
		 * matched to find the element whose attribute value changes dynamically. You can also find elements whose attribute value is static (not changes).
		 * 
		 */
		System.out.println("*****************************************");
		System.out.println("using starts-with() axes");
		List<WebElement> containsContainer1=driver.findElements(By.xpath("//*[starts-with(@id,'input')]"));
		for(int i=0;i<containsContainer1.size();i++) {
			String element_attribute=containsContainer1.get(i).getAttribute("id");
			System.out.println(element_attribute);
			
		}
		
		System.out.println("*****************************************");
		WebElement text_sample=driver.findElement(By.xpath("(//a[text()='Login'])[1]"));
		System.out.println(text_sample.getAttribute("href"));
		
		System.out.println("**************using Following axes***************************");
		/*
		 * seelct all elements in the document of current node
		 */
		List<WebElement> rightPanelLinkslist=driver.findElements(By.xpath("//div[@class='list-group']//following::a[@class='list-group-item']"));
		for(int i=0;i<rightPanelLinkslist.size();i++) {
			String element=rightPanelLinkslist.get(i).getText();
			System.out.println(element);
			
		}
		
		 driver.get("http://demo.guru99.com/test/guru99home/");

	        //Search element inside 'Popular course' which are sibling of control 'SELENIUM' ,Here first we will find a h2 whose text is ''A few of our most popular courses' ,then we move to its parent element which is a 'div' , inside this div we will find a link whose text is 'SELENIUM' then at last we will find all of the sibling elements of this link('SELENIUM')
		 System.out.println("**************using axes***************************");
	        List <WebElement> dateBox = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));

	        //Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
	        for (WebElement webElement : dateBox) {
	            System.out.println(webElement.getText());
	        }     

		
		driver.quit();
	}

}
