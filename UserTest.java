
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
  
  private User user;
  
  @BeforeEach
  public void setUp() {
    user = new User();
  }
  
  @Test
  public void testSetName() {
    user.setName("John Doe");
    assertEquals("John Doe", user.getName());
  }
  
  @Test
  public void testSetEmail() {
    user.setEmail("john.doe@example.com");
    assertEquals("john.doe@example.com", user.getEmail());
  }
  
  @Test
  public void testSetPassword() {
    user.setPassword("password");
    assertEquals("password", user.getPassword());
  }
  
  @Test
  public void testValidEmail() {
    assertTrue(user.isValidEmail("john.doe@example.com"));
  }
  
  @Test
  public void testInvalidEmail() {
    assertFalse(user.isValidEmail("john.doe"));
  }
  
  @Test
  public void testGenerateUsername() {
    user.setName("John Doe");
    assertEquals("johndoe", user.generateUsername());
  }
  
  // Add more test cases here based on the functionality of the User class
}
