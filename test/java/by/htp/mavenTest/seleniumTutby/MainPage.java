package by.htp.mavenTest.seleniumTutby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

private final String URL = "https://www.tut.by";
	
	private final By titleElement = By.xpath("id('lst-id')");//--------
	//private final By searchElement = By.xpath("id('gsr')");
	//private final By title = By.xpath("");
	;
	public MainPage(WebDriver driver){
		//super(driver);
	}
	
	public void open(){
	//	getDriver().get(URL);
	}   

//	public NewsPage searchTitle()
	 {
	//  getDriver().findElement(titleElement).click;;
	//  getDriver().findElement(searchElement).submit();
	 // WebElement titlehead = driver.findElement(title); 
	  
	//  return (new NewsPage());
	 }
	
}

/*
public class NewsPage extends Page {

 private static final String BODY_XPATH = ".//*[@id='article_body']/p";

 public NewsPage(WebDriver driver) {
  super(driver);
 }

 public String getTitle() {
  return driver.getTitle();
 }

 public int calculateParagraphCount() {
  List<WebElement> pElements = driver.findElements(By.xpath(BODY_XPATH));
  return pElements.size();
 }
}
[16

*/