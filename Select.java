package week4.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		WebElement item2=driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item4=driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item6=driver.findElement(By.xpath("//li[text()='Item 6']"));
		Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(item2).click(item4).click(item6).keyUp(Keys.CONTROL).perform();
		

	}

}
