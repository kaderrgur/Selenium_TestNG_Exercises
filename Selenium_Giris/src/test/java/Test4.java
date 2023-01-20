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

public class Test4 {

    WebDriver  driver;
    @Test
    public void test1() {
        System.out.println("Test1 koşuldu..");
    }
    @Test
    public void test2() {
        System.out.println("Test2 koşuldu..");
    }
    @Test
    public void test3() {
        System.out.println("Test3 koşuldu..");
    }
    @Test
    public void test4() {
        System.out.println("Test4 koşuldu..");
    }
    @Test
    public void test5() {
        System.out.println("Test5 koşuldu..");
    }


}