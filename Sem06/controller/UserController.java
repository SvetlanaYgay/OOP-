package Sem06.controller;

import Sem06.model.User;

public interface UserController<T extends User> {
    void create(String firstName, String secondName, String lastName);
    void sendOnConsole();
    
}
