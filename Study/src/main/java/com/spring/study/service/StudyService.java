package com.spring.study.service;

import org.springframework.stereotype.Service;

import com.spring.study.vo.Login;

@Service
public interface StudyService {

	public void loginUser(Login login);

}
