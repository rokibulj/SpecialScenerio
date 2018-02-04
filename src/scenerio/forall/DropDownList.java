package scenerio.forall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownList {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://qa.elitecareer.net/");
		WebElement jobCategoryDropDown = driver.findElement(By.cssSelector("#dropdown_style"));
	}
	
	
}
