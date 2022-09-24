package com.cydeo.tests.day11_actions_JSexecuter_Practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_Circle_Drag_and_Drop {

    @Test
    public void drag_and_drop_test(){
        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //Locate accept cookes functionalties
        WebElement acceptCookiesButton=Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();
        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));
        //2. Drag and drop the small circle to bigger circle.
        BrowserUtils.sleep(3);
        Actions actions=new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.clickAndHold(smallCircle).
                pause(2).moveToElement(bigCircle)
                .pause(2)
                .release().
                pause(2).perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        String actualCircleText=bigCircle.getText();
        String expectedCircleText="You did great!";
        Assert.assertEquals(actualCircleText,expectedCircleText);

    }
}
