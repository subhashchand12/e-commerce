package com.subhash.eBookStore.service;

import com.subhash.eBookStore.dao.UserRepository;
import com.subhash.eBookStore.entity.User;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class UserServiceImpl  implements  UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user){
        return userRepository.save(user);
    }



}
