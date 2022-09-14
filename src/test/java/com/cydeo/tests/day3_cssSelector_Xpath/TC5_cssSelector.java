package com.cydeo.tests.day3_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC5_cssSelector {
    public static void main(String[] args) throws InterruptedException {
        // TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //  1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

         // 2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");


        // tagName[attribute='value']
        // input[name='USER_LOGIN']
        //  3- Enter incorrect username into login box:
        WebElement inputUsername=driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        inputUsername.sendKeys("incorrectUsername");


        //  4- Click to `Reset password` button
        // tagName[attribute='value']
        // button[class='login-btn']
        WebElement resetPasswordButton= driver.findElement(By.cssSelector("button[class='login-btn']"));
        resetPasswordButton.click();


        // 5- Verify “error” label is as expected
        // Expected: Login or E-mail not found

        // div[class='errortext']
        WebElement actualErrorTest=driver.findElement(By.cssSelector("div[class='errortext']"));
        String actualErrorText=actualErrorTest.getText();
        String expectedErrorText="Login or E-mail not found";


        if(actualErrorText.equals(expectedErrorText)){
            System.out.println("Error text verification test PASSED");
        }else {
            System.out.println("Error text verification test FAILED");
        }


        // PS: Inspect and decide which locator you should be using to locate web
        //   elements.
        //     PS2: Pay attention to where to get the text of this button from
        Thread.sleep(3000);
        driver.close();
    }
}
