package com.oil.OilFinding.service;

import ch.qos.logback.core.net.LoginAuthenticator;
import com.oil.OilFinding.model.entity.Login;
import com.oil.OilFinding.model.entity.User;
import com.oil.OilFinding.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class UserService implements UserDetailsService {
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail().orElseThrow(UsernameNotFoundException::new);
        return new Login(user);
    }

}
