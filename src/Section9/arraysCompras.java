package Section9;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;


public class arraysCompras {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();

        int j=0;
        String[] ItemsNeeded= {"Cucumber","Brocolli"};

        List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
       for (int i=0; i<products.size();i++)
       {

           String name=products.get(i).getText();
           List itemsNeededList = Arrays.asList(ItemsNeeded);


           if (name.contains("Cucumber")){
               //Click on add to cart
               driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
               break;
           }
       }

    }


}
