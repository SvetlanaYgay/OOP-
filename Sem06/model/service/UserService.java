package Sem06.model.service;

import Sem06.model.User;

public interface UserService<T extends User> {
    void create(String firstName, String secondName, String lastName);
}
