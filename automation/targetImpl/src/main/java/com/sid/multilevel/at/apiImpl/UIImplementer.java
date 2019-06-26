package com.sid.multilevel.at.apiImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.sid.multilevel.at.TargetRetrievable;
import com.sid.multilevel.at.dataModel.UserData;

public class UIImplementer implements TargetRetrievable {
	private static final Logger logger = Logger.getLogger(UIImplementer.class);
	public List<UserData> targetUserDataList = new ArrayList<UserData>();

	public void getTargeteUserInfo() {
		UserData apiUserData = new UserData();
		logger.info("Inside --> getTargeteUserInfo --> target --> UIImplementer");
		apiUserData.setUserName("UserName-API");
		apiUserData.setPassword("Password-API");
		apiUserData.setIslogin(true);
		logger.info("Exit --> getTargeteUserInfo --> target --> UIImplementer");
		targetUserDataList.add(apiUserData);
	}
}
