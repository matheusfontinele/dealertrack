package thinkbrq.dealertrack;

import java.io.File;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import thinkbrq.dealertrack.pages.dealertrack.HomePage;
import thinkbrq.dealertrack.pages.google.SearchPage;
import thinkbrq.dealertrack.utils.Utils;

public class HomePageTest {

	private WebDriver driver;
	private JSONObject datas;
	// File that it's used to the test
	File file = new File("src//test//resources//data//datass.json");

	// Just starting the browser and maximizing the window
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://google.com.br");

		driver.manage().window().maximize();
	}

	@Test
	public void goToHomePageAndTheUrlShouldBeCorrect() {

		JSONObject json = Utils.readJSONFile(file.getAbsolutePath(), 0);

		datas = (JSONObject) json.get("CT");

		SearchPage searchPage = new SearchPage(driver);

		HomePage homePage = searchPage.doASearch((String) datas.get("search")).clickInTheFirstResult();

		assert (homePage.getURL().equals((String) datas.get("expectedPage")));
	}
	
	@Test
	public void goToHomePageAndTheUrlShouldBeInvalid() {

		JSONObject json = Utils.readJSONFile(file.getAbsolutePath(), 1);

		datas = (JSONObject) json.get("CT");

		SearchPage searchPage = new SearchPage(driver);

		HomePage homePage = searchPage.doASearch((String) datas.get("search")).clickInTheFirstResult();

		assert (homePage.getURL() != ((String) datas.get("expectedPage")));
	}
	
	@AfterMethod
	public void finishTest() {
		this.driver.close();
	}
}
