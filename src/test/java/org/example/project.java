package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class project {
    @Test
    public void Test(){
        System.out.println("welcome");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https:/github.com/login");
        driver.findElement(By.id("login_field")).sendKeys("sravanikukkapalli");
        driver.findElement(By.name("password")).sendKeys("Sravani@123");
        driver.findElement(By.className("header-logo"));
        //driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot ")).click();
        driver.findElement(By.tagName("h1"));
        highlight(driver,driver.findElement(By.id("login_field")));
    }



}
