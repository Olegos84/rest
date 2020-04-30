package task;

import org.testng.annotations.BeforeMethod;
import task.service.Verifier;
import task.service.api.UserService;
import task.service.api.WorkedUserService;

public abstract class BaseTest {

    protected Verifier verifier;
    protected UserService userService;
    protected WorkedUserService workedUserService;

    @BeforeMethod
    protected void init() {
        verifier = new Verifier();
        userService = new UserService();
        workedUserService = new WorkedUserService();
    }
}
