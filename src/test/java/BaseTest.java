import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;

    @BeforeAll
    static void setup(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void setupDriver(){
        driver = new ChromeDriver();
    }
    @AfterEach
    void teardown(){
        System.out.println("driver is closed");
        driver.quit();
    }
}
