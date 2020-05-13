package Section10.Technique;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Exercise {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(text(),'Ayuda')]")).click();
        System.out.println("Before");
        System.out.println(driver.getTitle());
        Set<String>ids=driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentid = it.next();
        String child= it.next();
        driver.switchTo().window(child);
        System.out.println("after");
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentid);
        System.out.println("after2");
        System.out.println(driver.getTitle());



    }
}