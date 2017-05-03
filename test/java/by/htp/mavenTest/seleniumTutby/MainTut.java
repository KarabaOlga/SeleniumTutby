package by.htp.mavenTest.seleniumTutby;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTut {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","/home/dummy/selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://tut.by/");
		
		Thread.sleep(6000);
		
		WebElement emailElement = driver.findElement(By.xpath("id('title_new_block')/div[1]/h3/a/span[1]"));
		emailElement.click();
		
		Thread.sleep(500);
		
		
	}

}
