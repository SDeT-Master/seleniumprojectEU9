package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4_Config_Practice {

    /*
    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        // we are getting the browserType dynamically from our configuration.properties file
        String browser= ConfigurationReader.getProperty("browser");
        driver= WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }
     */


    @Test
    public void google_search_test(){
      //   3- Write “apple” in search box
        Driver.getDriver().get("https://www.google.com");

        WebElement googleSearchBox=Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
        //    4- Verify title:
        //    Expected: apple - Google Search
        String expectedTitle=ConfigurationReader.getProperty("searchValue")+" - Google Search";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);


    }

}
