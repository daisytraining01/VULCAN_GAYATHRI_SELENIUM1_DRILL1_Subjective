package com.newtours.pkg;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
        Select co = new Select (driver.findElement(By.name("country")));
		co.selectByVisibleText("AUSTRALIA");
		
		Select country = new Select(driver.findElement(By.name("country"))) ;
		country.selectByVisibleText("AUSTRALIA");

		Thread.sleep(2000);
        Select countrylist = new Select(driver.findElement(By.name("country")));
       
        List<WebElement> list = countrylist.getOptions();
        for(int i=0; i<list.size(); i++)       
            {
                System.out.println(list.get(i).getText());
            }
	}
}

	


