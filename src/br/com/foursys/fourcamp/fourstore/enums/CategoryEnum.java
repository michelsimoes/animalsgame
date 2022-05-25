package br.com.foursys.fourcamp.fourstore.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum CategoryEnum {
         Percussao("per"),
         SOPRO("sop"),
         CORDA("cord");
	
	public String key;

	public String getKey() {
		return key;
	}
	CategoryEnum(String key) {
		this.key = key;
	}
	
	public static final Map<String,CategoryEnum> lookup = new HashMap<String,CategoryEnum>();
	static {
		for(CategoryEnum t : EnumSet.allOf(CategoryEnum.class))
		lookup.put(t.getKey(), t);
	}
	

	 public static CategoryEnum get(String key) {
	    	return lookup.get(key);
	 }
}

