import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TitleTest extends BaseTest {

 @ParameterizedTest(name = "Testing title of page: {0}")
 @Tag("Regression")
 @Tag("{0}")
 @CsvFileSource(resources = "testData.csv")

 @DisplayName("Testing titles")
    void shouldValidateCorrectTitleSii(String url, String expectedTitle){
     //GIVEN
     driver.get(url);
     driver.manage().window().maximize();
     //WHEN
     String actualTitle= driver.getTitle();
     //THEN
     assertThat(actualTitle).isEqualTo(expectedTitle);

 }
}
