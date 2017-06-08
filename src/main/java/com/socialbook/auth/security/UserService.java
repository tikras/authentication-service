package com.socialbook.auth.security;


import com.socialbook.auth.entity.User;

import java.util.Optional;

/**
 * 
 * @author vladimir.stankovic
 *
 * Aug 17, 2016
 */
public interface UserService {
    public Optional<User> getByUsername(String username);
}
