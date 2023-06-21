package mandatoryHomeWork.selenium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Week8_Day1 {

	public static void main(String[] args) {
		
		//1.Load the URL https://www.amazon.in/
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//2.search as oneplus 9 pro
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//3.Get the price of the first product
		String price = driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
		System.out.println("Price of the mobile: "+price);
		
		//4. Print the number of customer ratings for the first displayed product
		String ratingCusCount = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("Total no of customer rating for the 1st product is: "+ratingCusCount);
		
		//5. Click the first text link of the first image
		 //Convert web driver object to TakeScreenshot
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		System.out.println("The first product link Clicked successfully");
		
		//6. Take a screen shot of the product displayed 
				//Take the screenshot
		        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				try {
		            FileUtils.copyFile(screenshot, new File("C:\\Users\\Manivannan V\\eclipse-workspace\\New_SDET_MergedProject\\snap1.png"));
		        } catch (IOException e) {
		            System.out.println(e.getMessage());
		        }
				
				//7. Click 'Add to Cart' button
				ArrayList< String> al=new ArrayList<>(driver.getWindowHandles());
				driver.switchTo().window(al.get(1));
				
				//8. Get the cart subtotal and verify if it is correct.
				
//9.close the browser
		 
	}
	
		
	
}
