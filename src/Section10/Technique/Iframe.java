package Section10.Technique;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        //Esta forma sirve para imprimir y saber cuantos iframe hay y colocarlo por ID
        //System.out.println(driver.findElement(By.tagName("iframe")).getSize());
        WebElement iframe = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
        driver.switchTo().frame(iframe);

        //Para mover el mouse
        Actions a= new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source,target).build().perform();

        //Para dejar de interactuar con el frame
        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();



    }
}
