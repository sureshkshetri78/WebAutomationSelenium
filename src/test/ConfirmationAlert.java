package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Training QA\\Selenium Training\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		driver.findElement(By.id("confirm")).click();
		Alert cA = driver.switchTo().alert();
		System.out.println(cA.getText());
		cA.accept();
		// cA.dismiss();
		
	}

}
