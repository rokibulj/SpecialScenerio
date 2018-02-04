package scenerio.forall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeHandle {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		WebElement iframe = driver.findElement(By.id("iframeResult"));
		// Access
		accessIntoIframe(driver, iframe);
		// Exit
		exitFromIframe(driver);
	}

	public static void accessIntoIframe(WebDriver driver, WebElement iframeElement) {
		driver.switchTo().frame(iframeElement);
	}

	public static void exitFromIframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
}
