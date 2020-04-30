package task.service.api;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import task.model.User;
import task.model.Page;
import task.model.WorkUser;

import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class UserService extends ApiService {
    private static final String POSTFIX = "users";

    public List<User> getUsersFromPage(Integer pageNumber) {
        Page page = get(URL + POSTFIX + "?pageNumber=" + pageNumber)
                .then()
                .statusCode(200)
                .extract()
                .as(Page.class);
        return page.getUsers();
    }
}
