package com.MavenTestNG;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BaseClass {
	
	@Test
    public void setup () {
        System.setProperty("webdriver.chrome.drivers", "Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver ();
        driver.get("https://www.google.com/");
        
        
        System.out.println("This is my Maven TestNG Project");
    }
    
    public void failThis () {
        Assert.assertEquals(12, 13);
	}

}
