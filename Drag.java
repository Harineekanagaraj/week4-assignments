package week4.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.id("draggable"));
		Actions builder=new Actions(driver);
		Point location=drag.getLocation();
		int X=location.getX();
		int Y=location.getY();
		builder.dragAndDropBy(drag, X+100, Y+50).perform();

	}

}
