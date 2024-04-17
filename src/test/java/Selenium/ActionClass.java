package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ActionClass {
    WebDriver driver;

    @Test
    public void Using_DoubleClick_Method() throws InterruptedException
    {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Actions actions=new Actions(driver);
        WebElement email=driver.findElement(By.id("email"));
        WebElement Pass=driver.findElement(By.name("pass"));
        actions.doubleClick(Pass).perform();
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void Using_DragDropMethod() throws  InterruptedException
    {
        driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        WebElement src=driver.findElement(By.id("draggable"));
        WebElement des=driver.findElement(By.xpath("//p[text()='Drop here']"));
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
        actions.moveToElement(src).clickAndHold().perform();
        actions.release(des).perform();
    }

   @Test
   public void KeyBoard_Method() throws InterruptedException
    {
        driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement element=driver.findElement(By.xpath("//input[@name='email']"));
        Actions actions=new Actions(driver);
        actions.contextClick(element).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(4000);
    }
    @Test
    public void Using_contextClickMethod() throws InterruptedException
    {
        driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
        Actions actions=new Actions(driver);
        Thread.sleep(2000);
        actions.contextClick(pass).perform();
       Thread.sleep(2000);
    }
    @Test
    public void ScrollUp_Function_And_MoveToElement() throws  InterruptedException
    {
        driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor jsexe=(JavascriptExecutor) driver;
        jsexe.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(4000);
        jsexe.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(5000);
    }
    @Test
    public void enterTextintoDisabledTextBox() throws  InterruptedException, IOException
    {
        driver =new ChromeDriver();
        driver.get("file:///C:/Users/www.abcom.in/Desktop/DisabledTextbox.html");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       js.executeScript("document.getElementById('t1').value='Ruchita'");
       Thread.sleep(3000);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("t2")));
        //Thread.sleep(3000);
       js.executeScript("document.getElementById('t2').value=''");
        js.executeScript("document.getElementById('t2').value='Chaudhari'");

    }
    @Test
    public void Frames_Function() throws InterruptedException
    {
        driver=new ChromeDriver();
        driver.get("file:///C:/Users/www.abcom.in/Desktop/Page2.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        driver.findElement(By.id("t1")).sendKeys("Ruchita");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("Chaudhari");
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    public void MouseHover()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.actimind.com/");
        driver.manage().window().maximize();
//find the menu "About Company"
        String xp = "//span[.='About Company']";
        WebElement menu = driver.findElement(By.xpath(xp));
//mouse hover on "About Company" menu
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        WebElement submenu = driver.findElement(By.linkText("Basic Facts"));
        submenu.click();
    }
    @Test
    public void tableSelection() {

        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/www.abcom.in/Desktop/Tablett.html");


        WebElement table = driver.findElement(By.id("example-table"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Select by index
        WebElement rowByIndex = rows.get(3);
        System.out.println("Selected by index: " + rowByIndex.getText());

    }
}

