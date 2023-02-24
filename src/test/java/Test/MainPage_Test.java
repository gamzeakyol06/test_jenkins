package Test;
import Base.Base;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class MainPage_Test extends Base {
    @BeforeTest
    public void BeforeMethod() {
        super.beforemethod();
    }
    @Test
    public void Page_Test() throws InterruptedException {
        driver.get(MAIN_PAGE_URL);
        Response response = given().
                when()
                .get(MAIN_PAGE_URL)
                .then()
                .extract().response();
        System.out.println("Application Status is "  + response.getStatusCode());
        if (response.getStatusCode() == 200) {
            System.out.println("Test is OK");
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is NOK");
            Assert.fail();
        }
        Thread.sleep(1000);
    }

    @AfterTest
    public void AfterMethod() {
        super.aftermethod();
    }
}