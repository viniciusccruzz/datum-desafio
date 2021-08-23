package datum_desafio.app.steps;

import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;

public class Config {

    @Before
    public void setup(){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api";

        /*RestAssured.requestSpecification = new RequestSpecBuilder().
                setContentType(ContentType.TEXT).
                build();

        RestAssured.responseSpecification = new ResponseSpecBuilder().
                expectContentType(ContentType.TEXT).
                build();*/

    }
}
