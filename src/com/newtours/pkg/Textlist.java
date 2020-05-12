package com.newtours.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriverException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		String str = driver.findElement(By.xpath("//*[@id=\"n-mainpage-description\"]")).getText();
		System.out.println(str);
	}

}
