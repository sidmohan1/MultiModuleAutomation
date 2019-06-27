package com.sid.multilevel.at;

import com.sid.multilevel.at.impl.ApiImplementer;
import com.sid.multilevel.at.apiImpl.UIImplementer;
import com.sid.multilevel.at.dataInterface.DataRetrievable;


public class App {
	public static DataRetrievable sourceRetrievable;
	public static DataRetrievable targetRetreiver;

	private static final String SOURCE = "XLS";
	private static final String TARGET = "UI";

	public static void main(String[] args) {
		SourceData();
		DestinationData();
		sourceRetrievable.getSourceUserInfo();
		targetRetreiver.getSourceUserInfo();
		System.out.println(sourceRetrievable.getSourceUserInfo());
		System.out.println(targetRetreiver.getSourceUserInfo());
	}

	public static void SourceData() {
		if (SOURCE.equals("XLS")) {
			sourceRetrievable = new ApiImplementer();
		}
	}

	public static void DestinationData() {
		if (TARGET.equals("UI")) {
			targetRetreiver = new UIImplementer();
		}
	}
}
