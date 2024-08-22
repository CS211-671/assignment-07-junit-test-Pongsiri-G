package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList userList;
    User user;
    @BeforeEach
    void init() {
        userList = new UserList();
        user = null;
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        userList.addUser("A", "1234");
        userList.addUser("B", "5678");
        userList.addUser("C", "7890");
        // TODO: find one of them
        user = userList.findUserByUsername("B");
        // TODO: assert that UserList found User
        String expected = "B";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        userList.addUser("A", "1234");
        userList.addUser("B", "5678");
        userList.addUser("C", "7890");
        // TODO: change password of one user
        userList.changePassword("A", "1234", "8888");

        // TODO: assert that user can change password
        assertTrue(userList.findUserByUsername("A").validatePassword("8888"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("A", "1234");
        userList.addUser("B", "5678");
        userList.addUser("C", "7890");
        // TODO: call login() with correct username and password
        user = userList.login("A", "1234");
        // TODO: assert that User object is found
        User actual = userList.findUserByUsername("A");
        User expected = user;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("A", "1234");
        userList.addUser("B", "5678");
        userList.addUser("C", "7890");
        // TODO: call login() with incorrect username or incorrect password
        user = userList.login("A", "9999");
        // TODO: assert that the method return null
        assertNull(user);
    }

}