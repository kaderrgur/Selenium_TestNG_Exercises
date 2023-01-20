import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Kader Gür");

        WebElement eMail = driver.findElement(By.cssSelector(".mr-sm-2[placeholder='name@example.com']"));
        eMail.click();
        eMail.sendKeys("kader.gur@hangikredi.com");

        WebElement currentAdress = driver.findElement(By.id("currentAddress"));
        currentAdress.click();
        currentAdress.sendKeys("İstanbul, Turkey");

        //JavascriptExecutor jsx = (JavascriptExecutor) driver;
        //jsx.executeScript("window.scrollBy(0,450)" , "");

        WebElement permanentAdress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAdress.click();
        permanentAdress.sendKeys("İstanbul, Turkey");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        driver.quit();


    }
}