package Section12.GettingLinkOtherWindow;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assigment {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        driver.manage().window().maximize();

        WebElement checkBox= driver.findElement(By.id("checkBoxOption2"));
                    checkBox.click();

        WebElement GetLabel =driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]"));
        String AAA = GetLabel.getText();

        WebElement dropbox = driver.findElement(By.id("dropdown-class-example"));
        Select checkbox2 = new Select(dropbox);
                checkbox2.selectByVisibleText(AAA);


        WebElement Enter = driver.findElement(By.name("enter-name"));
        Enter.sendKeys(AAA);
        WebElement Alert = driver.findElement(By.id("alertbtn"));
        Alert.click();

        String abc =driver.switchTo().alert().getText();
        if(abc.contains(AAA))

        {

            System.out.println("Test success");

        }

        else

            System.out.println("test unsuccess");

    }

    }
