package Test.Section8;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        try {
            Thread.sleep(5000);
            //Click  ida y vuelta
           driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
            //Clic from
           WebElement from = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
                      from.click();
           WebElement from2 = driver.findElement(By.xpath("//a[@text='Bagdogra (IXB)']"));
                      from2.click();
            Thread.sleep(2000);
            //Clic to
           WebElement to = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"));
                        to.click();
            //Validar calendar
            driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
            if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

            {
                System.out.println("its disabled");
                Assert.assertTrue(false);
            } else {
                Assert.assertTrue(true);
            }
            //Select family group
            driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

            Thread.sleep(2000L);
            //Select adult
            driver.findElement(By.id("divpaxinfo")).click();
            Select Adulto2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
            Adulto2.selectByValue("4");

           // driver.findElement(By.id("divpaxinfo")).click();
            Select nino = new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child")));
            nino.selectByValue("3");
            System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
            Thread.sleep(5000);
            Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult, 3 Child");

            //tipo de moneda
            /*Select currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
            currency.selectByValue("USD");*/

            WebElement search = (driver.findElement(By.xpath("//input[@value='Search']")));
                       search.click();


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
