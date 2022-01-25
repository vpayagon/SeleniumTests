package SeleniumTests.SeleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pgmp.base.TestBase;

public class HomePage  extends TestBase{
	
	@FindBy(id = "navbarText")
	WebElement lstheaders;
	
	@FindBy(xpath = "//*[@id=\"navbarText\"]/ul[1]/li[1]/a")
	WebElement lnkHome;

	@FindBy(xpath = "//*[@id=\"menu-main-navigation-1\"]/li[1]/a")
	WebElement lnkHome1;	
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div[1]/div[1]/div/h5")
	WebElement elemHome;
	
	@FindBy(xpath = "//*[@id=\"navbarText\"]/ul[1]/li[2]/a")
	WebElement lnkFlight;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div[1]/div/div/h5/b")
	WebElement elemFlight;
	
	@FindBy(xpath = "//*[@id=\"navbarText\"]/ul[1]/li[3]/a")
	WebElement lnkHotel;
	
	@FindBy(xpath = "//*[@id=\"tpwl-main-form\"]/div/div[1]/section/div/section/header/div/label")
	WebElement elemHotel;
		
	@FindBy(xpath = "//*[@id=\"navbarText\"]/ul[1]/li[5]/a")
	WebElement lnkPackages;
	
	@FindBy(xpath = "//*[@id=\"traveltour-page-wrapper\"]/div/div[1]/div[2]/div/div/div/div/form/div/label")
	WebElement elemPackages;
	
	
	@FindBy(xpath = "//*[@id=\"navbarDropdown\"]")
	WebElement elemMyAcc;
	
	@FindBy(xpath = "//*[@id=\"navbarText\"]/ul[2]/li/div/a[1]")
	WebElement elemMyBook;
	
	@FindBy(name = "booking-id")
	WebElement elembookId;
	
	@FindBy(name = "email")
	WebElement elemEmail;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/form/div[1]/ul/li")
	WebElement elemMsg;
	
	@FindBy(name = "submit")
	WebElement elemSubmit;
	
	public HomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public boolean displayoptions() {
		List<WebElement> liitems=lstheaders.findElements(By.tagName("li"));
		for(WebElement elem:liitems) {
			String s=elem.findElement(By.tagName("a")).getAttribute("text");
			System.out.println(s);
			
		}
		return true;
	}
	
	public boolean clickHome()  {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", lnkHome);
		return elemHome.isDisplayed();
		
	}
	public boolean clickFlight() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", lnkFlight);
		//lnkFlight.click();
		return elemFlight.isDisplayed();
	}
	public boolean clickHotel() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", lnkHotel);
		//lnkHotel.click();
		return true;
	}
	public boolean clickPackages() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", lnkPackages);
		//lnkPackages.click();
		return elemPackages.isDisplayed();
	}
	
	public boolean clickMyAcc() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", lnkHome1);
		//lnkHome.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", elemMyAcc);
		//lnkPackages.click();
		return true;
	}
	
	public boolean clickMybookings() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", elemMyBook);
		//lnkPackages.click();
		return true;
	}
	public boolean writefields() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		elembookId.sendKeys("Test");
		elemEmail.sendKeys("Test");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", elemSubmit);
		return true;
	}
	public boolean verifyMessage() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return elemMsg.isDisplayed();
		//lnkPackages.click();		
	}
}
