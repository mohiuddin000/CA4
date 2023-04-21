package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CA {
    ChromeDriver driver; 
    @BeforeClass 
    public void googletest() throws InterruptedException 
    { 
        WebDriverManager.chromedriver().setup(); 
        driver = new ChromeDriver(); 
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"); 
        Thread.sleep(15000);
 
    } 
    @Test 
    public void login() 
    { 
        driver.findElement(By.cssSelector("option[value='python']")).click();
        driver.findElement(By.cssSelector("option[value='junit']")).click();
        driver.findElement(By.cssSelector("option[value='jquery']")).click();
        driver.findElement(By.cssSelector("input[value='option-1']")).click();
        driver.findElement(By.cssSelector("input[value='option-4']")).click();
        driver.findElement(By.cssSelector("input[value='purple']")).click();
    } 
   /*  @AfterClass 
    public void submit() 
    { 
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    } */
}


