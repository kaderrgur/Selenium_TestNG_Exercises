import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        WebElement add = driver.findElement(By.id("addNewRecordButton")); //div[@class='col-md-7']/button[@id='addNewRecordButton']
        add.click();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.click();
        firstName.sendKeys("Kader");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("Gür");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.click();
        userEmail.sendKeys("kader@gmail.com");

        WebElement age = driver.findElement(By.id("age"));
        age.click();
        age.sendKeys("23");

        WebElement salary = driver.findElement(By.id("salary"));
        salary.click();
        salary.sendKeys("10000");

        WebElement department = driver.findElement(By.id("department"));
        department.click();
        department.sendKeys("IT");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        driver.quit();


    }
}