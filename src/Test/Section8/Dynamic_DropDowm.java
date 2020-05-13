package Test.Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamic_DropDowm {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://spicejet.com");  //"http://spicejet.com"



        //Este fue un ejercicio de como seleccionar un checkbox y hacer que marcara true y flase
       WebElement Check= driver.findElement(By.id("checkBoxOption1"));
                Check.click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
                Check.click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());

        driver.findElement(By.cssSelector("input[value='checkbox']")).getSize();
        driver.close();



        //  //a[@value='MAA']  - Xpath for chennai

        //  //a[@value='BLR']
/*
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(2000);

        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();*/
    }
}
