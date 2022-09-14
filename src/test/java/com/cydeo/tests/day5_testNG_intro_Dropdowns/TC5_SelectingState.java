package com.cydeo.tests.day5_testNG_intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC5_SelectingState {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
     //   TC #5: Selecting state from State dropdown and verifying result
    //    1. Open Chrome browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void selectingState() throws InterruptedException {
        //   2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        //    3. Select Illinois
        // DONE by using visible TEXT
        Select selectIllinois=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        selectIllinois.selectByVisibleText("Illinois");
        Thread.sleep(3000);

        //    4. Select Virginia
        // Done by using VALUE
       Select selectVirginia=new Select(driver.findElement(By.xpath("//select[@id='state']")));
       selectVirginia.selectByValue("VA");
        Thread.sleep(3000);

        //   5. Select California
        // done by using INDEX
        Select selectCalifornia=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        selectCalifornia.selectByIndex(5);

        //  6. Verify final selected option is California.
        // here we are getting the name of the currently selected method using getFirstSelectedOption
        String expectedState="California";
        String actualState=selectCalifornia.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedState,actualState);

        //  Use all Select options. (visible text, value, index)
        Thread.sleep(3000);

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }



}
