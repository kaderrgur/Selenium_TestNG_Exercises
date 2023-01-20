import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Test3 {

    WebDriver  driver;
    @BeforeTest
    public void testOncesiAdimlar() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSirasindakiAdimlar() {

        driver.get("https://demoqa.com/buttons");
    }

    @AfterTest
    public void testSonrasiAdimlar() {

        System.out.println("Test başarılı...");
        driver.close();
    }

}