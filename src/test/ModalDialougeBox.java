package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalDialougeBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Training QA\\Selenium Training\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//*[@ class = \"_2zrpKA _1dBPDZ\" and @ type = \"text\"]")).sendKeys("Suresh");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

	}

}
