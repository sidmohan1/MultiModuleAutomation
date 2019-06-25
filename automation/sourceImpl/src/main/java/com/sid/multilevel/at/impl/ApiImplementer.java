package com.sid.multilevel.at.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.sid.multilevel.at.SourceRetrievable;
import com.sid.multilevel.at.UserData;

public class ApiImplementer implements SourceRetrievable {
	
	public List<UserData> sourceUserDataList = new ArrayList<UserData>();
	private static final Logger logger = Logger.getLogger(ApiImplementer.class);

	
	public void getSourceUserInfo() {
		UserData apiUserData = new UserData();
		logger.info("Inside --> getSourceUserInfo --> source --> ApiImplementer");
		apiUserData.setUserName("UserName-API");
		apiUserData.setPassword("Password-API");
		apiUserData.setIslogin(true);
		logger.info("Exit --> getSourceUserInfo --> source --> ApiImplementer");
		sourceUserDataList.add(apiUserData);
	}

}
