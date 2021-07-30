package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinkPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();

		// Find where am supposed to go without clicking me?
		WebElement element = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String attribute = element.getAttribute("href");
		System.out.println("Am suppose to go to " + attribute);

		// verify if link is broken
		WebElement element2 = driver.findElement(By.linkText("Verify am I broken?"));
		String attribute2 = element2.getAttribute("href");
		element2.click();
		String errortitle = "HTTP Status 404 – Not Found";
		String title = driver.getTitle();
		System.out.println(title);
		if (errortitle.equals(title)) {
			System.out.println("Error page is displayed");
		}

		else
			System.out.println("Valid page displayed");

		// (Interact with same link name)
		driver.get("http://leafground.com/pages/Link.html");
		WebElement findElement = driver.findElement(By.linkText("Go to Home Page"));
		String attribute3 = findElement.getAttribute("href");
		System.out.println(attribute3);
		WebElement findElement2 = driver.findElement(By.linkText("Go to Home Page"));
		String attribute4 = findElement2.getAttribute("href");
		System.out.println(attribute4);
		if (attribute3.equals(attribute4)) {
			findElement.click();
		}

	}

}
