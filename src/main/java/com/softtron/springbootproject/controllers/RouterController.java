package com.softtron.springbootproject.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softtron.springbootproject.domains.User;
import com.softtron.springbootproject.services.UserService;

@RestController
public class RouterController {
@Autowired
UserService userService;
@RequestMapping(path = "/findall")
public Set<User> findalluser(){
	return userService.findalluser();	
}
@GetMapping(path ="/delete")
public Map  deleteUser(@RequestParam(value ="userId") Integer id) {
	Map map = new HashMap<>();
	if(id !=-1) { 
	userService.deleteUser(id);
	map.put("200", "成功删除id为: "+id+" 的数据");
	}
	return map;
	
}
@GetMapping(path ="/insert")
public Map insertUser(User user) {
	Map map = new HashMap<>();
	if(user.getUserId()==-1) { 
	 userService.insertUser(user);
	 map.put("200", "插入成功");
	}
	return map;
	
}
@GetMapping(path ="/update")
public Map  updateUser(User user) {
	Map map = new HashMap<>();
    userService.updateUser(user);
    map.put("200", "修改成功");
	return map;
	
}
}
