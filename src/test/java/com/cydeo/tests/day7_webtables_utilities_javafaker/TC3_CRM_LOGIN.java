package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC3_CRM_LOGIN extends TestBase {


    // TC #3: Login scenario
    @Test
    public void crm_login_test1(){

        // 1. Create new test and make set ups
        // 2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        // 3. Enter valid username
        WebElement inputUsername= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //helpdesk1@cybertekschool.com
       // Helpdesk2@cybertekschool.com
        // 4. Enter valid password
        WebElement inputPassword=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        //UserUser

        // 5. Click to `Log In` button
        WebElement loginButton=driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        // 6. Verify title is as expected:
        // Expected: Portal

        BrowserUtils.verifyTitle(driver,"Portal");

    }

    @Test
    public void crm_login_test2(){
        // 1. Create new test and make set ups
        // 2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver);
        // 6. Verify title is as expected:
        // Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");

    }

    @Test
    public void crm_login_test3(){
        // 1. Create new test and make set ups
        // 2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver,"helpdesk2@cybertekschool.com","UserUser");
        // 6. Verify title is as expected:
        // Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");

    }
}
