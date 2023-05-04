package service;

import model.User;

public interface UserService {
    public void saveUser(User user);

    public boolean isUserPresent(User user);
}
