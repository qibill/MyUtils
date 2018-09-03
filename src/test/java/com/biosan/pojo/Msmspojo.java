package com.biosan.pojo;

import java.util.Map;

public class Msmspojo {
	private Map<String, Double> map;
	
	public static Msmspojo creatpojo() {
		Msmspojo msmspojo = new Msmspojo();
		msmspojo.setMap(Msms.creatMsms());
		return msmspojo;
	}

	public Map<String, Double> getMap() {
		return map;
	}

	public void setMap(Map<String, Double> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return map.toString();
	}
	
	
}
