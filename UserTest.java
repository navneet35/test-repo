
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    
    private User user;
    
    @BeforeEach
    public void setUp() {
        user = new User("John", "Doe", 30);
    }

    @Test
    public void testGetFullName() {
        Assertions.assertEquals("John Doe", user.getFullName());
    }

    @Test
    public void testGetAge() {
        Assertions.assertEquals(30, user.getAge());
    }

    @Test
    public void testSetAge() {
        user.setAge(40);
        Assertions.assertEquals(40, user.getAge());
    }

    @Test
    public void testIsAdult() {
        Assertions.assertTrue(user.isAdult());
    }
}
