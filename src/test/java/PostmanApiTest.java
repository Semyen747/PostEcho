import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanApiTest {
    @Test
    void shouldReturnQueryAndGetQuery() {
        given()
                .baseUri("https://postman-echo.com")
                .body("HI")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("HELLO"))
        ;

    }

    @Test
    void shouldReturnRusQueryAndGetRusQuery(){
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("ку")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("привет"))
        ;
    }


}