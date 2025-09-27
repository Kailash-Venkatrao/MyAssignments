package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
        opt.addArguments("guest");
        
		//initialize Chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//load the URL
		driver.get("https://en-gb.facebook.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait to load all web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click on 'create new account' button
		driver.findElement(By.linkText("Create new account")).click();		
		
		//firstname
		driver.findElement(By.name("firstname")).sendKeys("Kailash");
		
		//lastname
		driver.findElement(By.name("lastname")).sendKeys("Venkatrao");
		
		//mobile number or phone number
		driver.findElement(By.name("reg_email__")).sendKeys("test@test.com");
		
		//new pwd
		driver.findElement(By.name("reg_passwd__")).sendKeys("testpwd");
		
		//date of birth
		//day
		WebElement day = driver.findElement(By.id("day"));
		Select option1= new Select(day);
		option1.selectByValue("9");
		
		//month
		WebElement month = driver.findElement(By.id("month"));
		Select option2 = new Select(month);
		option2.selectByVisibleText("Nov");
		
		//year
		WebElement year = driver.findElement(By.id("year"));
		Select option3 = new Select(year);
		option3.selectByValue("1998");
		
		//gender
		driver.findElement(By.xpath("//input[@name='sex' and  @value ='2']")).click();
		
	}

}
