package com.REST_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MobileDAO {
	
	List<Mobile> mobileList = new ArrayList<Mobile>();
	
	public MobileDAO() {
		
		Mobile m1 = new Mobile("Samsung", "Silver", 35000);
		Mobile m2 = new Mobile("POCO", "Black", 18000);
		
		mobileList.addAll(Arrays.asList(m1,m2));
	}
	
	public List<Mobile> addNewMobile(Mobile m){
		mobileList.add(m);
		return mobileList;
	}

}
