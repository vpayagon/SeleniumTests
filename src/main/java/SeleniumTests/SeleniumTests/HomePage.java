package SeleniumTests.SeleniumTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pgmp.base.TestBase;

public class HomePage  extends TestBase{
	
	
	@FindBy(xpath = "//*[@id=\"navbarText\"]/ul[1]/li[1]/a")
	WebElement lnkHome;
	
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
	
	public HomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public boolean clickHome() {
		lnkHome.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(elemHome));
		return elemHome.isDisplayed();
		
	}
	public boolean clickFlight() {
		lnkFlight.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(elemFlight));
		return elemFlight.isDisplayed();
	}
	public boolean clickHotel() {
		lnkHotel.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(elemHotel));
		return elemHotel.isDisplayed();
	}
	public boolean clickPackages() {
		lnkPackages.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(elemPackages));
		return elemPackages.isDisplayed();
	}
	
}
