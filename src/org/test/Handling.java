package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sam\\eclipse-workspace-sele\\Windows\\drivers\\chromedriver_1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 11 pro max");
		
		WebElement bTn=driver.findElement(By.xpath("//input[@class='nav-input'][1]"));
		bTn.click();
		
		Thread.sleep(5000);
		WebElement item=driver.findElement(By.xpath("//span[text()='Apple iPhone 11 Pro Max (64GB) - Space Grey'][1]"));
		item.click();
	}
}
