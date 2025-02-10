import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.given;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApiTest {


    private static final String BASE_URL = "https://gorest.co.in/public/v2/users";

    private static int id;


    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = BASE_URL;


    }

    @Test
    @Order(1)
    void createUser() {

        String user = """
                 {
                 "name": "Agastya Rana",
                        "email": "agastyak_rmanlll@wintheiser-sanford.example",
                        "gender": "female",
                        "status": "inactive"
                        }
                """;

        id =

                given()
                        .headers("Authorization", "Bearer " + "49308e2bb95ebbb8e8854a12636dd9a19fd467ba210ac7e67d4935ebb02594e9")
                        .contentType(ContentType.JSON)
                        .body(user)
                        .when()
                        .post()
                        .then()
                        .log()
                        .body()
                        .assertThat()
                        .statusCode(201)
                        .extract().path("id");


    }


    @Test
    @Order(3)
    void deletePost() {
        given()
                .contentType(ContentType.JSON)
                .headers("Authorization", "Bearer " + "49308e2bb95ebbb8e8854a12636dd9a19fd467ba210ac7e67d4935ebb02594e9")
                .when()
                .delete("/" + id)
                .then()
                .assertThat()
                .statusCode(204)
                .log().all();
    }

}
