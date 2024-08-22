package ku.cs.models;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> users;

    public UserList() {
        users = new ArrayList<>();
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.isUsername(username)) {
                return user;
            }
        }
        return null;
    }

    public void addUser(String username, String password) {
        User exist = findUserByUsername(username);
        if (exist == null) {
            users.add(new User(username, password));
        }
    }


    //TODO: implements this method to change user's password to newPassword by verified oldPassword
    //TODO: return true if process is completed, otherwise return false
    public boolean changePassword(String username, String oldPassword, String newPassword) {
        User user = login(username, oldPassword);
        if (user != null){
            user.setPassword(newPassword);
            return true;
        }
        return false;
    }

    //TODO: implements this method to find user in users with valid password
    //TODO: return User object if username and password is correct, otherwise return null
    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.validatePassword(password)) {
                return user;  // Return the user if the username and password match
            }
        }
        return null;  // Return null if no matching user is found
    }
}