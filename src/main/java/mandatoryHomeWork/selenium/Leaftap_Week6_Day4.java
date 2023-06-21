package mandatoryHomeWork.selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftap_Week6_Day4 {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Enter username and pwd
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click login button using class locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.xpath("//div[@for='crmsfa']")).click();
		
		//Click on Leads Button
		driver.findElement(By.partialLinkText("Leads")).click();
		
		//Click on Create Lead
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		//click companyName using id locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		// Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Elizabeth");
		
		// Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anburaj");
		
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("LocalName");
		
		// Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Software");
		
		//Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi this is Elizaebth Anburaj.");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("elizabethanburaj@yahoo.com");
		
		//Select State/Province as NewYork Using Visible Text
		Select dd=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		dd.selectByVisibleText("Texas");
		
		//Click on Create Button
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		//Click on edit button
		driver.findElement(By.linkText("Edit")).click();
		
		//Clear the Description Field using .clear()
		driver.findElement(By.name("departmentName")).clear();
		
		//Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Note: We have a team connect ASAP");
		
		// Click on update button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Validate the Title of Resulting Page
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
