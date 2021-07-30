package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoadingAcmeTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		// Enter email and password
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		// click login
		driver.findElement(By.className("btn-primary")).click();
		//driver.findElement(By.linkText("Log In")).click();
		// Check Titlepage is displayed correctly
		String pagetitle = "ACME System 1 - Dashboard";
		String title = driver.getTitle();
		
		System.out.println("Original title is: " +pagetitle);
		System.out.println("Title is: " +title);

		if (pagetitle.equals(title)) {
			System.out.println("Page landed correctly");

		} else
			System.out.println("Page not landed up properly");
		//Logout from page
		driver.findElement(By.linkText("Log Out")).click();
		//close window
		driver.close();
		

	}
}
