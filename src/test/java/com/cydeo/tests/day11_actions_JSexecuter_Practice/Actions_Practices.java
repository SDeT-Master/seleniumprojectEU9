package com.cydeo.tests.day11_actions_JSexecuter_Practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Practices {

    @Test
    public void task_4_and_5_test(){

        //TC #4: Scroll practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");
        //3- Scroll down to “Powered by CYDEO”
        //create object of Actions and pass our "driver" instance
        Actions actions=new Actions(Driver.getDriver());
        //Locating cydeo link to be able to pass in the actions method
        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));
        //4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(cydeoLink).perform();

        //
        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.

        for (int i = 0; i < 4; i++) {
            actions.sendKeys(Keys.PAGE_UP).perform();
        }

        //2- Scroll back up to “Home” link using PageUP button

        Driver.closeDriver();

    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();

    }

    @Test
    public void test3(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();

    }


    @Test
    public void test4(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();

    }




}
