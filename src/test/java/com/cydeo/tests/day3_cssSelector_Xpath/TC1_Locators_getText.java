package com.cydeo.tests.day3_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1_Locators_getText {
    public static void main(String[] args) throws InterruptedException {


     //   TC #1: NextBaseCRM, locators and getText() practice
        //    1- Open a chrome browser
        //WebDriverManager.chromedriver().setup();
      //  WebDriver driver=new ChromeDriver();
       WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        //    2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        //    3- Enter incorrect username: “incorrect”
     //   driver.findElement(By.className("login-inp")).sendKeys("incorrect password");
        WebElement inputUsername=driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");


        //    4- Enter incorrect password: “incorrect”
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //    5- Click to login button.

        WebElement loginClick = driver.findElement(By.className("login-btn"));
        loginClick.click();

        //    6- Verify error message text is as expected:
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String expectedErrorMessage="Incorrect login or password";
        String actualMessage=errorMessage.getText();


        //   Expected: Incorrect login or password
        if(actualMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification PASSED");
        }else {
            System.out.println("Error message verification FAILED");
        }



        //   PS: Inspect and decide which locator you should be using to locate web
        //   elements.
        Thread.sleep(3000);

driver.close();

    }
}
