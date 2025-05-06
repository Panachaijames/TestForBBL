package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private final Map<Long,User> users = new HashMap<>();
    private long nextId = 1;

    public List<User> getAllUser(){
        return new ArrayList<>(users.values());
    }
    public User getUserByID(Long id)
    {
        return users.get(id);
    }
    public User createUser(User user){
        user.setId(nextId++);
        users.put(user.getId(), user);
        return user;
    }
    public User updateUser(Long id, User user){
        if(!users.containsKey(id))return null;
        user.setId(id);
        users.put(id,user);
        return user;
    }
    public boolean deleteUser(Long id){
        return users.remove(id) != null;
    }

}
