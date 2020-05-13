package Section9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class arraysREal {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MICROSECONDS);

        int j = 0;
        String[] ItemsNeeded = {"Cucumber", "Brocolli", "Tomato", "Potato"};
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {
            //brocoli - 1 kg
            //Brocoli,      1 kg
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();

            //format it to get actual vegetable name
            //convert array into array list for ease search
            // check wheter name you extracted is present arrayList or not-

            List itemsNeededList = Arrays.asList(ItemsNeeded);

            if (itemsNeededList.contains(formattedName)) {
                j++;
                //Click on add to cart
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == ItemsNeeded.length) {
                    break;


                }
            }

        }
        
    }

}