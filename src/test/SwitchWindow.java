package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Training QA\\Selenium Training\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");
		String mw = driver.getWindowHandle();
		System.out.println("Main window name is mw "+ mw );
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		
		Set <String> awn  = driver.getWindowHandles();
		System.out.println("All window name is "+ awn );
		
		

	}

}
