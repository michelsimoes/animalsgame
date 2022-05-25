package br.com.foursys.fourcamp.fourstore.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum DepartmentEnum {
	ELETRICO("elet"), 
	ACUSTICO("acus");

	public String key;

	public String getKey() {
		return key;
	}

	DepartmentEnum(String key) {
		this.key = key;
	}

	public static final Map<String, DepartmentEnum> lookup = new HashMap<String, DepartmentEnum>();
	
	static {
		for(DepartmentEnum t : EnumSet.allOf(DepartmentEnum.class)) 
		lookup.put(t.getKey(), t);
	}
	
	public static DepartmentEnum get(String key) {
		return lookup.get(key);
	
	}
}
