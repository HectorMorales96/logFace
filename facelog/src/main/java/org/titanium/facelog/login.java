package org.titanium.facelog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class login {



    final String chromePath = System.getProperty("user.dir") + "/driver/chromedriver.exe";
    WebDriver driver;
    String eResult = "Jose";
    String aResult = "";
    String URL = "https://www.facebook.com/";

    @BeforeTest
    public void BrowserLaunch(){
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get(URL);
    }

    @Test
    public void WlcomePageFB(){
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("email")).sendKeys("hectormoro02@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("puebas99");
        driver.findElement(By.id("loginbutton")).click();
        aResult = driver.findElement(By.className("_1vp5")).getText();
        Assert.assertEquals(aResult,eResult);
        System.out.println(aResult);
        System.out.println(eResult);
    }

    @AfterTest
    public void CloseBW(){
        driver.close();
    }


}
