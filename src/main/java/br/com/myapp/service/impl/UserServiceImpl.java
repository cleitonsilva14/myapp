package br.com.myapp.service.impl;

import br.com.myapp.dto.RegistrationDto;
import br.com.myapp.models.Role;
import br.com.myapp.models.UserEntity;
import br.com.myapp.repository.RoleRepository;
import br.com.myapp.repository.UserRepository;
import br.com.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void saveUser(RegistrationDto registrationDto) {
        UserEntity user = new UserEntity();
        user.setUsername(registrationDto.getUsername());
        user.setEmail(registrationDto.getEmail());
        user.setPassword(registrationDto.getPassword());
        Role role = roleRepository.findByName("USER");
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
    }
}
