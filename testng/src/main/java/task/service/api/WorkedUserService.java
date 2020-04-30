package task.service.api;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import task.model.WorkUser;

import static io.restassured.RestAssured.given;

public class WorkedUserService extends ApiService {
    private static final String POSTFIX = "users";

    public WorkUser create(WorkUser user) {
        RestAssured.baseURI = URL;
        return given().urlEncodingEnabled(true)
                .header("Accept", ContentType.JSON.getAcceptHeader())
                .body(new Gson().toJson(user))
                .post(POSTFIX)
                .then().statusCode(201).extract().as(WorkUser.class);
    }
}
