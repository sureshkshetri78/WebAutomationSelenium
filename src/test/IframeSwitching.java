package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeSwitching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Training QA\\Selenium Training\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
		driver.switchTo().frame("ID_Frame1");
		driver.findElement(By.name("ts_first_name")).sendKeys("suresh");
		driver.findElement(By.name("ts_last_name")).sendKeys("basnet");
		
		driver.switchTo().parentFrame();
		WebElement frame = driver.findElement(By.id("ID_Frame2"));
		driver.switchTo().frame(frame);
		driver.findElement(By.name("ts_first_name")).sendKeys("qqqqq");
		driver.findElement(By.name("ts_last_name")).sendKeys("zzzzz");
	}

}
