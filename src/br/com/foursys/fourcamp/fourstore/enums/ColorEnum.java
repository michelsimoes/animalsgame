package br.com.foursys.fourcamp.fourstore.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum ColorEnum {
	PRETO("01"),
	MARROM("02"),
	BRANCO("03");
	
	public String key;

	public String getKey() {
		return key;
	}

    ColorEnum(String key){
    	this.key = key;
    }
    
    private static final Map<String,ColorEnum> lookup = new HashMap<String,ColorEnum>();
    static {
    	for(ColorEnum t : EnumSet.allOf(ColorEnum.class))
    	lookup.put(t.getKey(), t);
    }
    
    public static ColorEnum get(String key) {
    	return lookup.get(key);
    	
    }



}
