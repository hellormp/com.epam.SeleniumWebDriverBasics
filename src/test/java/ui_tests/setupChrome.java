package ui_tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class setupChrome {

    WebDriver driver;


    @BeforeSuite
    static void setupClass() {

        WebDriverManager.chromedriver().driverVersion("100.0.4896.127").setup();
        WebDriverManager.chromedriver().browserVersion("100.0.4896.127").setup();

    }
    @BeforeTest
    void setupTest() {
        driver = new ChromeDriver();
    }
    @AfterTest
    void teardown() {
        driver.quit();
    }
    @Test
    void test() {
        // Exercise
        driver.get("https://google.com");
        String title = driver.getTitle();

    }


}
