package api;

import org.apache.http.entity.ContentType;
import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;



public class CreateNewOwnerApiTest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "http://46.101.230.213:9966/petclinic";
        RestAssured.basePath = "/api";
        RestAssured.requestSpecification =
                new RequestSpecBuilder()
                        .setAccept(ContentType.JSON)
                        .setContentType(ContentType.JSON)
                        .build();
    }
}
