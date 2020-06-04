package Section9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class ExplicitWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\d\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http:www.itgeared.com/demo/1506-ajax-loading.html");
        driver.manage().window().maximize();
        WebDriverWait impli = (WebDriverWait) new WebDriverWait(driver, 5);

        WebElement lnk = driver.findElement(By.cssSelector("a[href*='loadAjax']"));
                    lnk.click();

        impli.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));

        System.out.println(driver.findElement(By.id("results")).getText());

        driver.close();

    }
}
