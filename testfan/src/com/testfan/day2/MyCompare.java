package com.testfan.day2;

import java.util.Comparator;

public class MyCompare implements Comparator<User> {


	@Override
	public int compare(User o1, User o2) {
		if (o1 != null && o2 != null) {
			if (o1.getAge() > o2.getAge()) {
				return -1;
			} else {
				return 1;
			}
		}
		return 0;
	}

}
