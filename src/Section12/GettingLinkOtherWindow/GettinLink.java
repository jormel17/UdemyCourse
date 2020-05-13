package Section12.GettingLinkOtherWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class GettinLink {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        driver.manage().window().maximize();

        //1. Give me the count of links on the page.
        //2. Count of footer section-



         System.out.println(driver.findElements(By.tagName("a")).size());
         WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
         System.out.println(footerdriver.findElements(By.tagName("a")).size());
        //3-
        WebElement firstColum=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(firstColum.findElements(By.tagName("a")).size());

        //4- click on each link in the coloumn and check if the pages are opening-
        for (int i=1;i<firstColum.findElements(By.tagName("a")).size(); i++)
        {
            String clikonLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            firstColum.findElements(By.tagName("a")).get(i).sendKeys(clikonLink);
            Thread.sleep(5000);
        }
        // opens all the tabs
        Set<String> abc=driver.getWindowHandles();
        Iterator<String>  it=abc.iterator();
        while(it.hasNext())
        {


            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
            //driver.close();

        }

    }
}
