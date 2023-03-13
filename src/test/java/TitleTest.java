import org.apache.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TitleTest extends BaseTest {
    private static final Logger log = Logger.getLogger(TitleTest.class);


    @ParameterizedTest(name = "Testing title of page: {0}")
    @Tag("Regression")
    @Tag("{0}")
    @CsvFileSource(resources = "testData.csv")

    @DisplayName("Testing titles")
    void shouldValidateCorrectTitleSii(String url, String expectedTitle) {
        log.info("Testing title of page: " + url);
        //GIVEN
        driver.get(url);
        driver.manage().window().maximize();
        //WHEN
        String actualTitle = driver.getTitle();
        //THEN
        assertThat(actualTitle).isEqualTo(expectedTitle);
        log.info("Title of page: " + url + " is " + actualTitle);


    }
}
