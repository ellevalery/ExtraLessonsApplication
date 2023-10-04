package com.extralessonsapplication.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public void createUser(UserEntity userEntity) throws Exception{
        this.userRepository.save(userEntity);
    }

    public ArrayList<UserEntity> getAllUsers() {
        return (ArrayList<UserEntity>) this.userRepository.findAll();
    }
}
