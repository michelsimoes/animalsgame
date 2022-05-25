package br.com.foursys.fourcamp.fourstore.data.interfaces;

import java.util.List;

public interface DataInterface {
	
	public void save(Object object);
	public void update(Object object);
	public void delete(Object object);
	public Object getById(String id);
	public List<Object> listAll();
	

}
