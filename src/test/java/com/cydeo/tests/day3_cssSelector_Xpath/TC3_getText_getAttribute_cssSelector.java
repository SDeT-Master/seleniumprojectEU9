package com.cydeo.tests.day3_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3_getText_getAttribute_cssSelector {
    public static void main(String[] args) throws InterruptedException {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        // 3- Verify “Log in” button text is as expected:
        // Expected: Log In
       // WebElement signInButton= driver.findElement(By.className("login-btn"));

        //    tagName[attribute='value'] *****************
        //     input[class='login-btn']

       // WebElement signInButton= driver.findElement(By.cssSelector("input[class='login-btn']"));

        WebElement signInButton= driver.findElement(By.cssSelector("input[type='submit']"));

        // getting the value of the attribute "value"
        String expectedButtonText="Log In";
        String actualButtonText=signInButton.getAttribute("value");


      if(actualButtonText.equals(expectedButtonText)){
          System.out.println("Log in button verification test PASSED");
      }else {
          System.out.println("Log in button verification test FAILED");
      }


        // PS: Inspect and decide which locator you should be using to locate web
        // elements.
        //    PS2: Pay attention to where to get the text of this button from
        Thread.sleep(3000);
        driver.close();
    }
}
