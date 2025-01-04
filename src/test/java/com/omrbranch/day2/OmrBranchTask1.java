package com.omrbranch.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmrBranchTask1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("abc123@gmail.com");
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("qwerty12345");
		
		WebElement clklogin = driver.findElement(By.xpath("//button[text()='Login']"));
		clklogin.click();
		
	}
}
