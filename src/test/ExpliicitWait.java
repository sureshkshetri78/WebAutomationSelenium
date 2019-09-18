package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver", "D:\\Training QA\\Selenium Training\\Driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText( "LinkText-6"))).click();
		
		driver.close();
		
		
	}

}
