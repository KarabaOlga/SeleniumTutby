package by.htp.mavenTest.seleniumTutby;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;


@RunWith(JUnit4.class)

public class SmokeTest extends TestCase{
	
	//System.setProperty("webdriver.gecko.driver","/home/dummy/selenium/geckodriver");
	
	private WebDriver driver;

	
	@Before
	public void initBrowser()
	{
		System.setProperty("webdriver.gecko.driver","/home/dummy/selenium/geckodriver");
		driver = new FirefoxDriver();
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}


	@Test
	public void calculateParagraphCount() {
		// Open home page
		HomePage homePage = new HomePage(driver);
		homePage.open();
		// Open news page
		NewsPage newsPage = homePage.getNewsPage();
		// print title
		System.out.println(newsPage.getTitle());
		// print count of paragraphs
		System.out.println(newsPage.calculateParagraphCount());
	}

	
	@After
	public void destroyBrowser()
	{
		driver.quit();
	}

}
/*
	@Test
	public void oneCanSelectPhonesPageInCatalog()
	{
		// Open main page
		MainPage mainPage = new MainPage(driver);
		mainPage.open();
		// Select Catalog
		CatalogPage catalogPage = mainPage.selectCatalog();
		// Select mobile phones from catalog
		catalogPage.selectMobilePhones();
	}

	@After
	public void destroyBrowser()
	{
		driver.quit();
	}
}
*/

