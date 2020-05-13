package Section12.GettingLinkOtherWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Calendar {
    public static void main(String[] args) throws InterruptedException {

        //Variables
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        WebDriverWait impli = (WebDriverWait) new WebDriverWait(driver, 5);
        WebElement calendar = driver.findElement(By.id("ctl00_mainContent_view_date1"));
        //boolean aa= driver.findElement(By.id("ui-datepicker-div")).getText().contains("September");



        Thread.sleep(3000);

        calendar.click();
       // WebElement next= driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
       // driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] ")).getText().contains("September 2020");
        while (!driver.findElement(By.id("ui-datepicker-div")).getText().contains("September"))
        {
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            // next.click();
        }

        List<WebElement> abc = driver.findElements(By.className("ui-state-default"));
        //WebElement bca = (WebElement) driver.findElements(By.className("ui-state-default"));
        for (int i=0;i<abc.size();i++){
            String text =driver.findElements(By.className("ui-state-default")).get(i).getText();
           //String abc2= abc.get(i).getText();
            if (text.equalsIgnoreCase("17")){
                driver.findElements(By.className("ui-state-default")).get(i).click();
                break;
            }
        }
    }
}