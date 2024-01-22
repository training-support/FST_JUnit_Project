package examples;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ExceptionsTest {
    @Test
    public void testUsernameIsNull() {
        // assertThrows(Exception, execute())
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                User obj = new User();
                obj.setName("Sa");
            }
        });
    }

    @Test
    public void testUsernameIsNullLambda() {
        System.out.println("Exception Test starts");
        assertThrows(IllegalArgumentException.class, () -> {
            User user = new User();
            user.setName(null);
        });

        System.out.println("Exception Test ends");
    }
}
