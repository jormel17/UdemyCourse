package Section10.Technique;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement i = driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]"));
                    i.click();
        WebElement u = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
                    u.click();

        Set<String> aaa=driver.getWindowHandles();
        Iterator<String> o =aaa.iterator();

        String Parent=o.next();
        String child=o.next();
        driver.switchTo().window(child);

        System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
        System.out.println("after 2");
        driver.switchTo().window(Parent);
        System.out.println(driver.getTitle());

    }
}
