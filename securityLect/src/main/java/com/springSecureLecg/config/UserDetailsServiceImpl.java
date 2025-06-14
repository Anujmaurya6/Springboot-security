package com.springSecureLecg.config;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springSecureLecg.entity.UsersDetailsEntity;
import com.springSecureLecg.repository.UsersDetailsRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsersDetailsRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsersDetailsEntity user = repo.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(), user.getPassword(), Collections.emptyList());
    }
}
