package com.cydeo.tests.day10_upload_actions_jsexcuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_Registration_Form {
    @Test
    public void registration_form_test(){
      //  TC#1: Registration form confirmation
        //   Note: Use JavaFaker OR read from configuration.properties file when possible.
        //    1. Open browser
        //    2. Go to website: https://practice.cydeo.com/registration_form
        //Driver.getDriver()--> driver.get(url)
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        Faker faker=new Faker();
        //   3. Enter first name
        WebElement inputFirstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        //String fakeFirstname=faker.name().firstName();
        inputFirstName.sendKeys(faker.name().firstName());

        //   4. Enter last name
        WebElement inputLastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //   5. Enter username
        WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
       // userName.sendKeys(faker.name().username().replace(".",""));
        userName.sendKeys(faker.bothify("helpdesk###"));

        String user=faker.bothify("helpdesk###");
        userName.sendKeys(user);


        //  6. Enter email address
        WebElement emailAddress=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        emailAddress.sendKeys(user+"@email.com");

        //   7. Enter password
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.numerify("########"));
        //faker.internet().password();

        //  8. Enter phone number
        WebElement phoneNumber=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
       // phoneNumber.sendKeys(faker.phoneNumber().cellPhone());
        phoneNumber.sendKeys(faker.numerify("###-###-####"));

        //  9. Select a gender from radio buttons
        WebElement gender=Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        gender.click();

        //  10. Enter date of birth
        WebElement birthDay=Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(2004,1920);
        birthDay.sendKeys("03/08/2000");

        //  11. Select Department/Office
        Select departmentDropdown=new Select(Driver.getDriver().
                findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));


        //  12. Select Job Title
        Select jobTitle=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,8));

        //   13. Select programming language from checkboxes
        WebElement programmingLanguage=Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        programmingLanguage.click();

        //   14. Click to sign up button
        WebElement signUpButton=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        signUpButton.click();

        //  15. Verify success message “You’ve successfully completed registration.” is
        //   displayed.
        WebElement verifyText=Driver.getDriver().findElement(By.xpath("//p"));
        String actualTest=verifyText.getText();
        String expectedText="You've successfully completed registration!";

        Assert.assertEquals(actualTest,expectedText);
        boolean textDisplayed=verifyText.isDisplayed();
        System.out.println("textDisplayed = " + textDisplayed);

        //      Note:
                //  1. Use new Driver utility class and method
                //  2. User JavaFaker when possible
        //   3. User ConfigurationReader when it makes sense
    }
}
