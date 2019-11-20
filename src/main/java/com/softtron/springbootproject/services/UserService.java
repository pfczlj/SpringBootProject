package com.softtron.springbootproject.services;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtron.springbootproject.daos.UserDao;
import com.softtron.springbootproject.domains.User;

@Service
public class UserService {
@Autowired
UserDao userDao;
public Set<User> findalluser(){	
	return userDao.findalluser();	
}
//删除
public void deleteUser(Integer id) {
		 userDao.deleteUser(id);	
}
//插入
public void insertUser(User user){
	 userDao.insertUser(user);	
}
//修改
public void  updateUser(User user) {
	userDao.updateUser(user);
}
}

