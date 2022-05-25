package br.com.foursys.fourcamp.fourstore.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum TypeEnum {
	VIOLAO("vio"),
	VIOLINO("violi"),
	SAXOFONE("sax"),
	FLAUTA("fla"),
	BATERIA("bat"),
	PIANO("pia");
	
	public String key;

	public String getKey() {
		return key;
	}
	
	TypeEnum(String key){
		this.key = key;
	}
	
	public static final Map<String,TypeEnum> lookup = new HashMap<String,TypeEnum>();
	static {
		for(TypeEnum t : EnumSet.allOf(TypeEnum.class))
			lookup.put(t.getKey(), t);
	}
	 public static TypeEnum get(String key) {
	    	return lookup.get(key);
	    	
	    }

}
