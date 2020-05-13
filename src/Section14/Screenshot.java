package Section14;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) throws InterruptedException, IOException {

        //Variables
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Para eliminar las cookies
        driver.manage().deleteAllCookies();
        String URL = "https://www.google.com/";
        //Para tomar Screenshot
        driver.get(URL);


        File scrShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile((File) scrShot,new File("C:\\Users\\Jormel Vunic\\Documents\\UdemyCourse\\ScreenShoot.png"));


    }
}
