package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com.tr/?hl=tr");
        Thread.sleep(1000);
        driver.quit();

        //Timeouts
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // Sayfanın yüklenmesini bekler.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Yapılan işlemleri bekler.

        //Windows
        driver.manage().window().maximize(); //Pencereyi maksimize eder.
        int x = driver.manage().window().getPosition().getX(); // Pencerenin x düzlemindeki konumunu verir.
        int y = driver.manage().window().getPosition().getY(); // Pencerenin y düzlemindeki konumunu verir.

        //Url
        driver.get("https://www.google.com.tr/"); // Açılacak adres verilir.
        String CurrentUrl = driver.getCurrentUrl(); //Sayfadaki url'i getirir.
        String Title = driver.getTitle(); // Sayfanın title'ını getirir.
        String PageSource = driver.getPageSource(); // Sayfanın kaynak kodlarını getirir.

        //Navigate
        driver.navigate().back(); //Geri gitmek için kullanılır.
        driver.navigate().forward(); //İleri gitmek için kullanılır.
        driver.navigate().refresh(); // Sayfayı yenilemek için kullanılır.


    }
}