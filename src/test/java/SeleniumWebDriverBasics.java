import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class SeleniumWebDriverBasics {
    private static final String URL = "https://www.bookdepository.com/";
    private static WebDriver driver;


    @BeforeTest
    public void setUpDriverConditions(){
        System.setProperty("webdriver.chrome.driver", "D:\\IDEA projects\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void openPage(){
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
        driver.navigate().to(URL);
        WebElement SearchFeild = driver.findElement(By.xpath("//input[@class='text-input']"));
        SearchFeild.sendKeys("camileo");
        WebElement SearchButton = driver.findElement(By.xpath("//button[@aria-label='Search']"));
        SearchButton.click();
        WebElement AddToBasket = driver.findElement(By.xpath("//a[@data-isbn='9780007419494']"));
        AddToBasket.click();
        driver.quit();
    }

}
