package com.generation.firstproject.service;

import java.util.List;
import com.generation.firstproject.model.*;

public interface UserService {
    List<User> getAll();

    void add(User user);

    void remove(User user);

    int size();
    
    User getUser(int position);
}
