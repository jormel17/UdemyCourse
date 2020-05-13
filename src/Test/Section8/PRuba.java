package Test.Section8;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PRuba {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bancoestado.cl/imagenes/comun2008/banca-en-linea-personas.html");


        try {

            WebElement iframe = driver.findElement(By.xpath("//*[@id=\"caja\"]/iframe"));
            driver.switchTo().frame(iframe);

            WebElement user = driver.findElement(By.id("username"));
            user.sendKeys("123456");

            WebElement pass = driver.findElement(By.id("password"));
            pass.sendKeys("000000");


            driver.switchTo().parentFrame();



        } catch (
                NoSuchElementException ne) {
            System.err.println("No se encontro el webElement " + ne.getMessage());
        } catch (
                NoSuchFrameException nf) {
            System.err.println("No se encontro iframe" + nf.getMessage());
        } catch (
                NoAlertPresentException na) {
            System.err.println("No se encontro la alerta " + na.getMessage());
        } catch (TimeoutException te) {
            System.err.println("Tiempo de espera excedido " + te.getMessage());
        } catch (WebDriverException me) {
            System.err.println("Webdriver Falló" + me.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {


        }


    }

}
