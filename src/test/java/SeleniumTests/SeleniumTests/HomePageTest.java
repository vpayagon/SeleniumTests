package SeleniumTests.SeleniumTests;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pgmp.base.TestBase;


public class HomePageTest extends TestBase {

	HomePage homepage;
	OpenApp openapp;
	//String applicationurl=prop.getProperty("applicationurl");
		public HomePageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeTest
	public void setup() {
		initialization();
		openapp=new OpenApp();
		homepage = new HomePage();

	}

	@Test(priority = 1)
	public void OpenAppTest() throws InterruptedException {
		homepage=openapp.navigateApp();
	}
	@Test(priority = 2)
	public void FetchHeaders() throws InterruptedException {
		Assert.assertTrue(homepage.displayoptions());
	}
	
	@Test(priority = 2)
	public void HomeClickTest() throws InterruptedException {
		Assert.assertTrue(homepage.clickHome());
	}
	@Test(priority = 3)
	public void ClickFlightTest() throws InterruptedException {
		Assert.assertTrue(homepage.clickFlight());
	}
	@Test(priority = 4)
	public void ClickHotelTest() throws InterruptedException {
		Assert.assertTrue(homepage.clickHotel());
	}
	@Test(priority = 5)
	public void ClickPackagesTest() throws InterruptedException {
		Assert.assertTrue(homepage.clickPackages());
	}
	@Test(priority = 6)
	public void ClickMyAccountTest() throws InterruptedException {
		Assert.assertTrue(homepage.clickMyAcc());
	}
	@Test(priority = 7)
	public void ClickMyBookingTest() throws InterruptedException {
		Assert.assertTrue(homepage.clickMybookings());
	}
	@Test(priority = 8)
	public void WriteMyBookingFieldsTest() throws InterruptedException {
		Assert.assertTrue(homepage.writefields());
	}
	@Test(priority = 9)
	public void verifyMessageTest() throws InterruptedException {
		Assert.assertTrue(homepage.verifyMessage());
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
