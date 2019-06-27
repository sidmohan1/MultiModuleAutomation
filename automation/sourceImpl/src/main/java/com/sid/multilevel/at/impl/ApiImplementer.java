package com.sid.multilevel.at.impl;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import com.sid.multilevel.at.dataInterface.DataRetrievable;
import com.sid.multilevel.at.dataModel.UserData;

public class ApiImplementer implements DataRetrievable {

	public List<UserData> sourceUserDataList = new ArrayList<UserData>();
	private static final Logger logger = Logger.getLogger(ApiImplementer.class);

	@Override
	public UserData getSourceUserInfo() {
		UserData apiUserData = new UserData();
		logger.info("Inside --> getSourceUserInfo --> source --> ApiImplementer");
		apiUserData.setUserName("UserName-API");
		apiUserData.setPassword("Password-API");
		apiUserData.setIslogin(true);
		logger.info("Exit --> getSourceUserInfo --> source --> ApiImplementer");
		sourceUserDataList.add(apiUserData);
		return apiUserData;
	}

}
