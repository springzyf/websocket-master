package com.mytest.DAO;

import com.mytest.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserLoginReg extends JpaRepository<User,String> {

    public User findByName(String name);

}
