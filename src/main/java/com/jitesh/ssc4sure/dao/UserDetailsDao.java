package com.jitesh.ssc4sure.dao;

import com.jitesh.ssc4sure.model.User;

public interface UserDetailsDao {
  User findUserByUsername(String username);
}
