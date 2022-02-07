import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumChromeTest {
    @Test
    void seleniumChromeTest() {
        System.setProperty("webdriver.chrome.driver","D:\\Gierki\\Szkolenie\\Testing\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        driver.get("https://google.com");

        driver.quit();
    }
}
