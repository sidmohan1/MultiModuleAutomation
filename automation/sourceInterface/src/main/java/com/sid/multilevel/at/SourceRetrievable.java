package com.sid.multilevel.at;

import java.util.ArrayList;
import java.util.List;

import com.sid.multilevel.at.dataModel.UserData;


public interface SourceRetrievable extends SourceBaseClass{

	public List<UserData> sourceUserDataList = new ArrayList<UserData>();
	public List<UserData> getSourceUserInfo() ;
	
}
