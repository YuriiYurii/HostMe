package com.softserve.edu.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.edu.dao.RequestDao;
import com.softserve.edu.entity.Request;
import com.softserve.edu.service.RequestService;

@Service
public class RequestServiceImpl implements RequestService {
	@Autowired
	private RequestDao requestDao;

	@Override
	@Transactional
	public void createRequest(Request request) {
		requestDao.create(request);
	}

}
