package ui_tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class ChromeTest {

    WebDriver driver;




    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().avoidBrowserDetection().browserVersion("100.0.4896.60");
        WebDriverManager.chromedriver().driverVersion("100.0.4896.60");

    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void test() {
        // Your test logic here
    }

}
