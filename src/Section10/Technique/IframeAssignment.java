package Section10.Technique;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeAssignment {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        /*WebElement clic = driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]"));
                    clic.click();
       // WebElement frame1 = driver.findElement(By.name("frame-top"));
        //WebElement frame2 = driver.findElement(By.name("frame-middle"));
        WebElement text = driver.findElement(By.id("content"));

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(text.getText());
*/
        driver.findElement(By.linkText("Nested Frames")).click();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());

    }
}