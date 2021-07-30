package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();

		// finding xy coordinates

		WebElement element = driver.findElement(By.id("position"));
		Point location = element.getLocation();
		System.out.println("testing : " + location);
		int x = location.getX();
		int y = location.getY();
		System.out.println("Size of button is " + x + " and " + y);

		WebElement element2 = driver.findElement(By.xpath("//button[@id='position']"));
		Point location2 = element2.getLocation();
		System.out.println("testing location2 : " + location2);

		// color of button
		String color = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Background color is " + color);

		// Size of button

		WebElement size = driver.findElement(By.xpath("//button[@id='size']"));
		Dimension dimension = size.getSize();
		System.out.println("Size of the button is " + dimension);

		// Go home
		driver.findElement(By.id("home")).click();
	}

}
