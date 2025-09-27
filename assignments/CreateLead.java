package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
		
		//Clicking on leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on 'Create Lead'
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kailash");
		
		//Enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Venkatrao");
		
		//Enter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		
		//Enter title
		WebElement Title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		Title.sendKeys("Added Title");
		
		//clicking Create Lead button
		driver.findElement(By.name("submitButton")).click();
		
		//closing the browser
		driver.close();
		}
	}

