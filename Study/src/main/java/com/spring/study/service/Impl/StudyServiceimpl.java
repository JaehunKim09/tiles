package com.spring.study.service.Impl;

import org.springframework.stereotype.Service;

import com.spring.study.StudyDAO.StudyDAO;
import com.spring.study.service.StudyService;
import com.spring.study.vo.Login;

@Service
public class StudyServiceimpl implements StudyService{

	StudyDAO studyDAO;

	@Override
	public void loginUser(Login login) {
	   studyDAO.LoginId(login);
				
	}

}
