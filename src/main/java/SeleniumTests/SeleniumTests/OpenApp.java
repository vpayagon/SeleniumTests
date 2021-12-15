package SeleniumTests.SeleniumTests;

import org.openqa.selenium.support.PageFactory;

import com.pgmp.base.TestBase;

public class OpenApp extends TestBase {

	public OpenApp() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public HomePage navigateApp() {
		driver.get("https://www.tripodeal.com");
		return new HomePage();
	}
}
