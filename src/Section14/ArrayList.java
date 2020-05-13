package Section14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ArrayList {

    //Ordenar una lista de elementosy comparar que esten bien
    public static void main(String[] args) throws InterruptedException, IOException {

        //Variables
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.google.com/";
        WebElement aa= driver.findElement(By.xpath("//table[@id='sortableTable']"));
        aa.click();


        List<WebElement> firstColList= driver.findElements(By.cssSelector("tr td:nth-child(2)"));

/*
        ArrayList<String> originalList =new ArrayList <String>();

        for(int i=0;i<firstColList.size();i++)

        {
            originalList.add(firstColList.get(i).getText());
        }

        ArrayList<String> copiedList =new ArrayList<String>();

        for(int i=0;i<originalList.size();i++)

        {
            copiedList.add(originalList.get(i));

        }
//string

        Collections.sort(copiedList);
// Collections.reverse(copiedList);
        for(String s1:originalList )
        {
            System.out.println(s1);
        }

        System.out.println("*******************");

        for(String s2:copiedList )

        {
            System.out.println(s2);
        }

        Assert.assertTrue(originalList.equals(copiedList));

        */
    }


    }

