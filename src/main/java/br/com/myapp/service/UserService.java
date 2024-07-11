package br.com.myapp.service;

import br.com.myapp.dto.RegistrationDto;
import br.com.myapp.models.UserEntity;


public interface UserService {

    void saveUser(RegistrationDto registrationDto);
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);

}
