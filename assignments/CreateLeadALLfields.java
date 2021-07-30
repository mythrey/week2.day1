package week2.day1.assignments;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadALLfields {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximise the screen
		driver.manage().window().maximize();
		// Locate the webelement (DOM)

		// WebElement webUsername = driver.findElement(By.id("username"));
		// webUsername.sendKeys("demosalesmanager");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		// Create password
		WebElement webPassword = driver.findElement(By.id("password"));
		webPassword.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		// Verification
		String orgTitle = "Leaftaps - TestLeaf Automation Platform";
		//get title of the current window
		String title = driver.getTitle();

		if (orgTitle.equals(title)) {
			System.out.println("Page Landed up correctly");

		} else
			System.out.println("Page not Landed up correctly");

		// <a>+text
		// click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// click on Leads link
		driver.findElement(By.linkText("Leads")).click();
		// click on Create lead link
		driver.findElement(By.linkText("Create Lead")).click();
		// enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		// enter First Name
		String nameToenter = "Rajalakshmi";
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(nameToenter);
		// enter Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		// All fields under create lead page
		
		WebElement dd1 = driver.findElement(By.name("dataSourceId"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByVisibleText("Website");
		
		driver.findElement(By.name("firstNameLocal")).sendKeys("Raji");
		driver.findElement(By.name("personalTitle")).sendKeys("Mrs");
		driver.findElement(By.className("inputBox")).sendKeys("Student");
		driver.findElement(By.name("annualRevenue")).sendKeys("");
		
		WebElement dd2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByValue("IND_SOFTWARE");
		
		WebElement dd3 = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown3 = new Select(dd3);
		dropdown3.selectByVisibleText("Public Corporation");
		
		driver.findElement(By.name("sicCode")).sendKeys("");
		driver.findElement(By.name("description")).sendKeys("");
		driver.findElement(By.name("importantNote")).sendKeys("");
		
		
		WebElement dd4 = driver.findElement(By.name("marketingCampaignId"));
		Select dropdown4 = new Select(dd4);
		dropdown4.selectByVisibleText("Car and Driver");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/08/1989");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Tech");
		
		WebElement dd5 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropdown5 = new Select(dd5);
		dropdown5.selectByValue("INR");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("30");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("");
		
		// Clear and Enter the country code
		WebElement webCountrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		webCountrycode.clear();
		// To see what happens in county code like pausing.. it should be given in
		// milliseconds
		Thread.sleep(2000);
		webCountrycode.sendKeys("2");
		// click on Createlead submit button
		driver.findElement(By.className("smallSubmit")).click();

		// Checking whether given name is equal in output screen (Create lead)
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Name :" + text);

		if (nameToenter.equals(text)) {
			System.out.println("Correct name ");

		}

		// Dropdown Select
		/*
		 * WebElement dd1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 * Select dropdown1 = new Select(dd1); dropdown1.selectByValue("LEAD_WEBSITE");
		 * driver.findElement(By.linkText("Leads")).click();
		 * driver.findElement(By.id(""))
		 */

	}

}
