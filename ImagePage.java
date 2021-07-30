package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();

		// to find broken image
		Thread.sleep(5000);
		WebElement brokenimage = driver.findElement(By.xpath("//label[@for='position']/following-sibling::img"));
		if (brokenimage.getAttribute("naturalWidth").equals("0")) {
			System.out.println(brokenimage.getAttribute("outerHTML") + " is broken.");
		} else
			System.out.println("Image is not broken");

		// Enter the image using keyboard
		driver.findElement(By.xpath("(//label[@for='position'])[2]/following-sibling::img")).click();

	}
}
