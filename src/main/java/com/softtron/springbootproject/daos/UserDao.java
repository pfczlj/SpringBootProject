package com.softtron.springbootproject.daos;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.softtron.springbootproject.domains.User;

public interface UserDao {
	//查询
public LinkedHashSet<User> findalluser();
//删除
public void deleteUser(Integer id);
//插入
public void  insertUser(User user);
//修改
public void  updateUser(User user);
}
