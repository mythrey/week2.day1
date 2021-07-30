package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();

		// giving email id
		driver.findElement(By.id("email")).sendKeys("rajirox89@gmail.com");

		// using keyboard tab and enter
		WebElement presstab = driver.findElement(By.xpath("//input[@value='Append ']"));
		presstab.sendKeys("text");
		presstab.sendKeys(Keys.TAB);
		presstab.sendKeys(Keys.ENTER);

		// getting default text printed
		//WebElement element = driver.findElement(By.xpath("(//input[@value='TestLeaf'])[3]"));
		//String attribute = element.getAttribute("value");
		//System.out.println("Default text is : " + attribute);

		// clearing value
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();

		// checking if the field is disabled
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		if (enabled)
			System.out.println("Button is enabled");
		else
			System.out.println("Button is disabled");

	}

}
