package br.com.foursys.fourcamp.fourstore.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum SizeEnum {
	ADULTO("adult"),
	INFANTIL("infans");
	
	public String key;

	public String getKey() {
		return key;
	}
	
	SizeEnum(String key){
		this.key = key;
	}
	
	public static final Map<String,SizeEnum> lookup = new HashMap<String,SizeEnum>();
	static {
		for(SizeEnum t : EnumSet.allOf(SizeEnum.class))
			lookup.put(t.getKey(), t);
	}
	
	 public static  SizeEnum get(String key) {
	    	return lookup.get(key);
	 }

}
