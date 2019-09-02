package com.facebook2.service;

import com.facebook2.dao.FacebookDAO;
import com.facebook2.dao.FacebookDAOInterface;
import com.facebook2.entity.FacebookEmployee;

public class FacebookService implements FacebookServiceInterface
{
	private FacebookService() {}

	public static FacebookServiceInterface createServiceObject() 
	{
		return new FacebookService();
	}

	@Override
	public int createprofile(FacebookEmployee fe) {
		FacebookDAOInterface fd=FacebookDAO.createDaoObject();
		
		return fd.createProfileDAO(fe);
	}
	

}
