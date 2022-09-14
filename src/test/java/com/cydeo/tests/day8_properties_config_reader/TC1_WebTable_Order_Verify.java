package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_WebTable_Order_Verify {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //   TC #1: Web table practice
        //   1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void order_name_verify_test(){

        //locateThe Cell that has bob martin text in it
        //  2. Verify Bob’s name is listed as expected.
        WebElement bobMartinCell=driver.findElement(By.xpath("//table[@" +
                "id='ctl00_MainContent_orderGrid']/tbody/tr[7]/td[.='Bob Martin']"));

        System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());

        //  Expected: “Bob Martin”
        String expectedName="Bob Martin";
        String actualName=bobMartinCell.getText();
        Assert.assertEquals(actualName,expectedName,"No Match");

        //  3. Verify Bob Martin’s order date is as expected

        WebElement bobMartinDateCell=driver.findElement(By.xpath(
                "//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        //  Expected: 12/31/2021
        String expectedDate="12/31/2021";
        String actualDate=bobMartinDateCell.getText();

        Assert.assertEquals(actualDate,expectedDate);

    }

    @Test
    public void test2(){
        String costumerOrderDate1=WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("costumerOrderDate1 = " + costumerOrderDate1);


        String costumerOrderDate2=WebTableUtils.returnOrderDate(driver,"John Doe");
        System.out.println("costumerOrderDate2 = " + costumerOrderDate2);

    }

    //Using WebTable Utils.orderVerify();
    @Test
    public void test3(){

        WebTableUtils.orderVerify(driver,"Bart Fisher","01/16/2021");


    }

}
