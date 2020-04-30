package task.service;

import org.testng.asserts.Assertion;
import task.model.Entity;

import java.lang.reflect.Field;
import java.util.Objects;

public class Verifier extends Assertion {

    public void verifyThatFieldsNotNull(Entity entity) {
        Field[] fields = entity.getClass().getDeclaredFields();
        for (Field field: fields) {
            field.setAccessible(true);
            Object value = null;
            try {
                value = field.get(entity);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            assertTrue(Objects.nonNull(value),
                    String.format("Verify that %s is not null", field.getName()));
        }
    }
}
