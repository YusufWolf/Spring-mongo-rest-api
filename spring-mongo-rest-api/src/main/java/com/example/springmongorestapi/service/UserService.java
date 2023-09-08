package com.example.springmongorestapi.service;

import com.example.springmongorestapi.entity.User;
import com.example.springmongorestapi.repository.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// niye iki tane pom var aq burası genel dreictory içinde farklı farklı projeler olacak. parentını sildim zaten

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public User save(User user) {
        HashMap hashMap = new HashMap<>();
        //hashmapi doldursana ne yazcaksan. Onu şimdilik boş bıraktım
        user = new User();
        user.setId(user.getId());
        user.setName(user.getName());
        user.setSurname(user.getSurname());
        //user.setFeatures(hashMap);
        return user;
    }


    public List<User> getAll(){
        List<User> users = new ArrayList<>();
        users = userRepository.findAll();
        return users;
    }

// ayağa kaldır uygulama dediğin ne kanka
}


