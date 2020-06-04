package Test.Section8;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowm {

    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\d\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        try {
            driver.findElement(By.id("divpaxinfo")).click();
            Select Adulto2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
            Adulto2.selectByValue("4");

            Select nino = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
            nino.selectByIndex(3);

            Thread.sleep(5000);

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
            driver.close();
        }


    }

    }

