package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Popup {
    WebDriver driver;

   @Test
   public void  Alert_Promptpopup() throws  InterruptedException
    {
driver =new ChromeDriver();
driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@type='button']")).click();
Thread.sleep(2000);
Alert alert=driver.switchTo().alert();
Thread.sleep(2000);
System.out.println(alert.getText());
Thread.sleep(5000);
alert.sendKeys("Ruchita");
Thread.sleep(5000);
alert.accept();
Thread.sleep(3000);
alert.getText();
    }
    @Test
      public void hiddenPopUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.irctc.co.in/nget/train-search");
driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted"));
//driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[2]/div[1]/p-calendar/span/input"));
        WebElement datePopUp = driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input"));
        datePopUp.click();
       WebElement datePicker = datePopUp.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]/span"));
        datePicker.click();
        Thread.sleep(2000);
        WebElement dateChoose = datePopUp.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[2]/td[2]/a"));
       dateChoose.click();
    }
    @Test
    public void simple_Alert() throws InterruptedException, IOException
    {
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.id("alertButton")).click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
    }
    @Test
    public void simple_alert2()
    {
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("timerAlertButton")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }
    @Test
    public void Confirmation_Popup() throws InterruptedException
    {
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("confirmButton")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.dismiss();
        Thread.sleep(3000);
    }
    @Test
    public void Prompt_popup() throws InterruptedException
    {
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='promptButton']")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("Ruchita chaudhari");
        Thread.sleep(2000);
        alert.accept();
    }
}
