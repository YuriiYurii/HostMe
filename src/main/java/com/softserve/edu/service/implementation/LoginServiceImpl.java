package com.softserve.edu.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.edu.dao.UserDao;
import com.softserve.edu.entity.User;
import com.softserve.edu.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserDao userDaoImpl;

	@Override
	@Transactional
	public User getUserByEmail(String email) {
		return userDaoImpl.getUserByEmail(email);
	}

	@Override
	@Transactional
	public User getUserByLogin(String login) {
		return userDaoImpl.getUserByLogin(login);
	}

}
