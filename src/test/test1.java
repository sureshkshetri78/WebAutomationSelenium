package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Training QA\\Selenium Training\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Suresh Basnet");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
		
	}

}
