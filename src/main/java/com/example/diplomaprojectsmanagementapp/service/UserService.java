package com.example.diplomaprojectsmanagementapp.service;

import com.example.diplomaprojectsmanagementapp.model.User;

public interface UserService {
    public void saveUser(User user);

    public boolean isUserPresent(User user);
}
