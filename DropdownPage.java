package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		//dropdown using index
		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select drop1 = new Select(dd1);
		drop1.selectByIndex(2);
		
		//dropdown using text
		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select drop2 = new Select(dd2);
		drop2.selectByVisibleText("Selenium");
		
		//dropdown using value
		WebElement dd3 = driver.findElement(By.id("dropdown3"));
		Select drop3 = new Select(dd3);
		drop3.selectByValue("4");
		
		//dropdown using sendkeys
		driver.findElement(By.xpath("//div[@class='example'][5]/select")).sendKeys("UFT/QTP");
		
	}

}
