package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class AutoIt {
    public WebDriver driver;
    @Test
    public void uploadFile() throws InterruptedException,IOException {
        driver = new ChromeDriver();
        driver.get("https://smallpdf.com/compress-pdf");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[contains(text(),'Choose')]")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\www.abcom.in\\Documents\\SDET\\ABC.exe");
        Thread.sleep(2000);

    }
}
