import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.*;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.base.Function;

public class Auto {

	MainPage mp = new MainPage();
	Auto_Login l = new Auto_Login();

	private WebDriver webDriver;
	private List<String> row;
	Wait<WebDriver> wait;
	DataReader sheetReader;

	private static ExtentReports report;
	private ExtentTest test;
	private static String reportFilePath = "Report.html";

	@BeforeClass
	public static void init_set_up() {
		report = new ExtentReports();
		ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(reportFilePath);
		extentHtmlReporter.config().setReportName("ReportName");
		extentHtmlReporter.config().setDocumentTitle("DocumentTitle");
		report.attachReporter(extentHtmlReporter);
	}

	@Before
	public void set_up() {
		webDriver = new ChromeDriver();

		mp = PageFactory.initElements(webDriver, MainPage.class);
		l = PageFactory.initElements(webDriver, Auto_Login.class);
		sheetReader = new DataReader(System.getProperty("user.dir") + "/data.xlsx");

		wait = new FluentWait<WebDriver>(webDriver).withTimeout(5, SECONDS).pollingEvery(1, SECONDS)
				.ignoring(org.openqa.selenium.NoSuchElementException.class);

	}

	@Test
	public void test_postcode() {
		row = sheetReader.readRow(0, "adam");
		webDriver.navigate().to("http://www.autotrader.co.uk/");

		mp.enter_postcode(webDriver, row.get(0));

		assertEquals("Car type\nUsed Nearly new New",
				webDriver.findElement(By.cssSelector(".show-types-option-types")).getText());

		test = report.createTest("actual all types");
		if ("Car type\nUsed Nearly new New".equals(webDriver.findElement(By.cssSelector(".show-types-option-types")).getText())) {
			test.pass("test passed");}
		}
	

	@Test
	public void test_postcode_distance() {
		row = sheetReader.readRow(0, "adam");
		webDriver.navigate().to("http://www.autotrader.co.uk/");

		mp.enter_distance(webDriver, Integer.parseInt(row.get(1).substring(0, 1)));
		mp.enter_postcode(webDriver, row.get(0));

		assertEquals(row.get(2),
				webDriver
						.findElement(By.cssSelector(
								"div.search-form__location-field:nth-child(1) > div:nth-child(1) > div:nth-child(2)"))
						.getText());

		test = report.createTest("test all types and distance");
		if (row.get(2) == webDriver
				.findElement(By.cssSelector(
						"div.search-form__location-field:nth-child(1) > div:nth-child(1) > div:nth-child(2)"))
				.getText())
			;
		{
			test.pass("test passed");
		}
	}

	@Test
	public void test_used_postcode() {
		row = sheetReader.readRow(0, "adam");
		webDriver.navigate().to("http://www.autotrader.co.uk/");
		mp.not_newish(webDriver);
		mp.not_new(webDriver);
		mp.enter_postcode(webDriver, row.get(0));

		assertEquals("Car type\nUsed", webDriver.findElement(By.cssSelector(".show-types-option-types")).getText());

		test = report.createTest("test all used");
		if ("Car type\nUsed".equals(webDriver.findElement(By.cssSelector(".show-types-option-types")).getText())) {
			test.pass("test passed");
		}
	}

	@Test
	public void test_new_postcode() {
		row = sheetReader.readRow(0, "adam");
		webDriver.navigate().to("http://www.autotrader.co.uk/");
		mp.not_newish(webDriver);
		mp.not_used(webDriver);
		mp.enter_postcode(webDriver, row.get(0));

		assertEquals("Car type\nNew", webDriver.findElement(By.cssSelector(".show-types-option-types")).getText());

		test = report.createTest("test all new");
		if ("Car type\nNew".equals(webDriver.findElement(By.cssSelector(".show-types-option-types")).getText())) {
			test.pass("test passed");
		}
	}

	@Test
	public void test_newish_postcode() {
		row = sheetReader.readRow(0, "adam");
		webDriver.navigate().to("http://www.autotrader.co.uk/");
		mp.not_used(webDriver);
		mp.not_new(webDriver);
		mp.enter_postcode(webDriver, row.get(0));

		assertEquals("Car type\nNearly new",
				webDriver.findElement(By.cssSelector(".show-types-option-types")).getText());

		test = report.createTest("test all newish");

		if ("Car type\nNearly new"
				.equals(webDriver.findElement(By.cssSelector(".show-types-option-types")).getText())) {
			test.pass("test passed");
		}
	}

	@Test
	public void check_null_sign_in() {
		webDriver.navigate().to("https://www.autotrader.co.uk/secure/signin?after-signin-url=");
		l.submit();

		assertEquals("Your email or password was incorrect. Please try again. ", webDriver
				.findElement(By.cssSelector(".signin-form-form > span:nth-child(8) > div:nth-child(3)")).getText());

		test = report.createTest("null_sign_in");
		
		if("Your email or password was incorrect. Please try again. ".equals( webDriver
				.findElement(By.cssSelector(".signin-form-form > span:nth-child(8) > div:nth-child(3)")).getText()))
		{test.pass("test passed");}
		
	}

	@Test
	public void incorrect_sign_in() {
		webDriver.navigate().to("https://www.autotrader.co.uk/secure/signin?after-signin-url=");
		l.enter_username("hello");
		l.enter_pass("hello");
		l.submit();
		assertEquals("Your email or password was incorrect. Please try again. ", webDriver
				.findElement(By.cssSelector(".signin-form-form > span:nth-child(8) > div:nth-child(3)")).getText());

		test = report.createTest("incorrect_sign_in");
		
		if("Your email or password was incorrect. Please try again. ".equals( webDriver
				.findElement(By.cssSelector(".signin-form-form > span:nth-child(8) > div:nth-child(3)")).getText()))
		{test.pass("test passed");}
	}

	@After
	public void afet() {
		webDriver.quit();
	}

	@AfterClass
	public static void end() {
		report.flush();
	}

}
