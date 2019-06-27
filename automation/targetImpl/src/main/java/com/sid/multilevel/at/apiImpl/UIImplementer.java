package com.sid.multilevel.at.apiImpl;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import com.sid.multilevel.at.dataInterface.DataRetrievable;
import com.sid.multilevel.at.dataModel.UserData;

public class UIImplementer implements DataRetrievable {
	private static final Logger logger = Logger.getLogger(UIImplementer.class);
	public List<UserData> targetUserDataList = new ArrayList<UserData>();

	@Override
	public UserData getSourceUserInfo() {
		UserData apiUserData = new UserData();
		logger.info("Inside --> getTargeteUserInfo --> target --> UIImplementer");
		apiUserData.setUserName("UserName-API");
		apiUserData.setPassword("Password-API");
		apiUserData.setIslogin(true);
		logger.info("Exit --> getTargeteUserInfo --> target --> UIImplementer");
		targetUserDataList.add(apiUserData);
		return apiUserData;
	}
}
