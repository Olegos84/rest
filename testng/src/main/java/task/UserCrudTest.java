package task;

import org.testng.annotations.Test;
import task.model.User;
import task.model.WorkUser;

import java.util.List;

public class UserCrudTest extends BaseTest {

    @Test(groups = {"P0"},
            testName = "testGetListUsersFromPage",
            description = "Get a list of users and make sure that users do not contain empty fields")
    public void testGetListUsersFromPage() {
        List<User> users = userService.getUsersFromPage(2);
        for (User user : users) {
            verifier.verifyThatFieldsNotNull(user);
        }
    }

    @Test(groups = {"P0"},
            testName = "testCreateUser",
            description = "Create a new user and verify that the REST API returns the created user")
    public void testCreateUser() {
        WorkUser expectedUser = WorkUser.WorkUserBuilder
                .aWorkUser()
                .withName("Oleg")
                .withJob("EPAM")
                .build();
        WorkUser actualCreatedUser = workedUserService.create(expectedUser);
        //The test fails because rest api returns only user id
        verifier.assertTrue(actualCreatedUser.equals(expectedUser),
                "Verify that returned user equals created");
    }
}
