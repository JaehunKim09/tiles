package com.spring.study.StudyDAO;

import org.springframework.stereotype.Repository;

import com.spring.study.vo.Login;

@Repository

public interface StudyDAO {

	public void LoginId(Login login);

}

