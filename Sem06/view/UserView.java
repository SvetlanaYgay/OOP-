package Sem06.view;

import java.util.List;

import Sem06.model.User;

public interface UserView<T extends User> {
    
    void sendOnConsole(List<T> list);
}
