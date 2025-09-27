package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		//Initializing Chrome driver
		ChromeDriver driver = new ChromeDriver(opt);
		
		//Loading URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Entering username and pwd
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Clicking on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Clicking on Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//Clicking on create Account
		driver.findElement(By.linkText("Create Account")).click();
		
		//Entering account name
		driver.findElement(By.id("accountName")).sendKeys("Infosys2");
		
		//Entering description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Selecting industry
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Industry.click();
		
		Select Indusvalue = new Select(Industry);
		Indusvalue.selectByValue("IND_SOFTWARE");
		
		//Selecting Ownership
		WebElement OwnerShip = driver.findElement(By.name("ownershipEnumId"));
		OwnerShip.click();
		
		Select Ownvalue = new Select(OwnerShip);
		Ownvalue.selectByVisibleText("S-Corporation");
		
		//Selecting Source
		WebElement Source = driver.findElement(By.id("dataSourceId"));
		Source.click();
		
		Select Sourcevalue = new Select(Source);
		Sourcevalue.selectByValue("LEAD_EMPLOYEE");
		
		//Selecting Marketing campaign
		WebElement MarketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		MarketingCampaign.click();
		
		Select MCValue = new Select(MarketingCampaign);
		MCValue.selectByIndex(6);
		
		//Selecting State or ProvinceId
		WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
		State.click();
		
		Select StateOptions = new Select(State);
		StateOptions.selectByValue("TX");
		
		//Clicking on submit
		driver.findElement(By.className("smallSubmit")).click();
		
		//verify account
		
		//closing the browser
		driver.close();
	}

}
