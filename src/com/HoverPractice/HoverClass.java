package com.HoverPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverClass {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Prasanth\\eclipse-workspace\\SeleniumTesting\\src\\com\\FirstClass\\SeleniumPractice.java");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement Xmark = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Xmark.click();
		System.out.println("-----User1--------");
		System.out.println("*********");
<<<<<<< HEAD
		
=======
		
		
>>>>>>> b31857fdadb01fa8ed1c40e18c8163b16be562cc
		WebElement Electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
	
		Actions actions = new Actions (driver);
		actions.moveToElement(Electronics).perform();
		
		WebElement Gaming = driver.findElement(By.xpath("//a[text()='Gaming']"));
		actions.moveToElement(Gaming).perform();
		WebElement Gamepad = driver.findElement(By.xpath("//a[text()='Gamepads']"));
		Gamepad.click();
		
		
		
		
		

	}

}
