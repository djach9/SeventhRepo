import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;

public class BaseTest {
    protected WebDriver driver;
    private static final Logger log = Logger.getLogger(BaseTest.class);


    @BeforeAll
    static void setup(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void setupDriver(){
        driver = new ChromeDriver();
        log.debug("Chrome browser opened");
    }
    @AfterEach
    void teardown(){
        System.out.println("driver is closed");
        log.debug("Chrome browser closed");
        driver.quit();
    }
}
