package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1 {
	public static WebDriver driver;
	public static WebDriver getBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\eclipse\\Divakar\\POM\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static void loadUrl(String Url) {
		driver.get(Url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static WebElement findElementById(String Value) {
		WebElement txt = driver.findElement(By.id(Value));
		return txt;
	}
	public static void setText(WebElement element, String value) {
		   element.sendKeys(value);	 
	}
	public static void getText(WebElement element, String value) {
		value = element.getText();
	}
	public static void getAttribute(WebElement element, String value) {
		value = element.getAttribute("value");
		System.out.println(value);
	}
	public static void selectByValue (WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public static WebElement findElementByPath(String path) {
		WebElement x = driver.findElement(By.xpath(path));
		return x;
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void quitBrowser() {
		driver.quit();
}
}