package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Training QA\\Selenium Training\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("09/18/2019");
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]//following::input[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]//preceding::input[9]")).click();
		String heading = driver.findElement(By.xpath("//*[contains(text(), 'n For')]")).getText();
		System.out.println(heading);
		

	}

}
