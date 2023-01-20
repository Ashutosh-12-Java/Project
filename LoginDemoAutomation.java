/**
 * 
 */
package ComplianceSutra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author hp
 *
 */
public class LoginDemoAutomation {

	//WebDriver
	WebDriver chromeWebDriver;
	/**
	 * Default Constructor
	 */
	public LoginDemoAutomation() {
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		chromeWebDriver = new ChromeDriver();
	}
	
	//Public method
	public void LaunchApplication()
	{
		//Launch the Application Under Test (AUT)
		chromeWebDriver.get("https://sakshingp.github.io/assignment/login.html");
		chromeWebDriver.manage().window().maximize();
	}
	
		//Public method
		public void SetUserName()
		{
			WebElement userNameWebElement = chromeWebDriver.findElement(By.xpath("//*[@id=\"username\"]"));
			userNameWebElement.sendKeys("U123");
		}
		
		public void SetPassword()
		{
			WebElement passwordWebElement = chromeWebDriver.findElement(By.xpath("//*[@id=\"password\"]"));
			passwordWebElement.sendKeys("P123");
		}
		public void LogInClick()
		{
			WebElement loginWebElement = chromeWebDriver.findElement(By.xpath("//*[@id=\"log-in\"]"));
			loginWebElement.click();
		}
		
		public void RememberMeChecked()
		{
			WebElement rememberMeWebElement = chromeWebDriver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[1]/label/input"));
			rememberMeWebElement.click();
		}
		
		//Method 
		public void SetUserInput(String xPathExpression, String inputValue)
		{
			WebElement webElement = chromeWebDriver.findElement(By.xpath(xPathExpression));
			
			if(webElement != null)
			{
				webElement.sendKeys(inputValue);
			}
			else
			{
				System.out.print(String.format("{0} web element is not found", xPathExpression));
				//throw new Exception(String.format("{0} web element is not found", xPath));
			}
		}		
		
		public void SetUserInput(String xPath)
		{
			WebElement webElement = chromeWebDriver.findElement(By.xpath(xPath));
			if(webElement != null)
			{
				webElement.click();
			}
			else
			{
				System.out.print(String.format("{0} web element is not found", xPath));
				//throw new Exception(String.format("{0} web element is not found", xPath));
			}
		}
	//Destroy allocated objects
	 protected void finalize() {  
	        System.out.print("Destroyed ");  
	        chromeWebDriver.close();
	        chromeWebDriver.quit();
	    }  
}