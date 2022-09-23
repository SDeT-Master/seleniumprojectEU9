package com.cydeo.tests.day4_findElements_checkBoxes_radioButtons;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MovieAutoPlay {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://ww2.123movies-official.net/");
        WebElement enterMovieName=driver.findElement(By.xpath("//input[@type='text']"));
        enterMovieName.sendKeys("1917"+ Keys.ENTER);
        WebElement findMovie=driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/section/div[4]/div/div[1]/div[1]/a"));
        findMovie.click();
        WebElement playTheMovie=driver.findElement(By.xpath("//div[@class='watching_player-area']"));
        playTheMovie.click();
        Thread.sleep(1000000);
        driver.close();
    }
}
