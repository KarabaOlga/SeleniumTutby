package by.htp.mavenTest.seleniumTutby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Page {

	private static final String URL = "https://www.tut.by/";
	private static final String MAIN_NEWS_XPATH = "//*[@id='title_news_block']/div[1]/h3/a";
	private static final String RESULTS_XPATH = "//*[@id='utm_article_block']/h2/a";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void open() {
		getDriver().get(URL);
	}

	public NewsPage getNewsPage() {

		WebElement mainNewsElement = (new WebDriverWait(driver, 2))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(MAIN_NEWS_XPATH)));
		mainNewsElement.click();

		(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(RESULTS_XPATH)));

		return new NewsPage(driver);
	}
}