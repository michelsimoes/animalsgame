package br.com.foursys.fourcamp.fourstore.data;

import java.util.ArrayList;
import java.util.List;

import br.com.foursys.fourcamp.fourstore.data.interfaces.DataInterface;
import br.com.foursys.fourcamp.fourstore.enums.CategoryEnum;
import br.com.foursys.fourcamp.fourstore.model.Product;

public class ProductData implements DataInterface {

	List<Object> lista = new ArrayList<Object>();

	public void save(Object produto) {
		lista.add(produto);
	}

	public void update(Object object) {
		Product produto = (Product) object;
		for (int x = 0; x > lista.size(); x++) {
			Product produto2 = (Product) lista.get(x);
			if (produto.getId().equals(produto2.getId())) {
				this.lista.set(x, produto2);

			}

		}

	}

	public void delete(Object object) {
		Product produto2 = (Product) object;
		for (int x = 0; x > lista.size(); x++) {
			Product produto = (Product) object;
			if (produto.getId().equals(produto2.getId())) {
				this.lista.remove(x);

			}

		}

	}

	public Object getById(String id) {
		Object retorno = null;
		for(int x = 0; x < lista.size(); x++) {
			Product produto = (Product) lista.get(x);
			if(produto.getId().equals(id)) {
				retorno = produto;
			}
			
		
		}

		return retorno;
	
	}
			

	public Object getBySku(String sku) {
		Object retorno = null;
		for(int x = 0; x < lista.size(); x++) {
			Product produto = (Product) lista.get(x);
			if(produto.getSku().equals(sku)) {
				retorno = produto;
			}
			
		
		}

		return retorno;
	
	}
		
		
	public List<Object> listAll(){
		
		return lista;
	}
	
	public List<Object> listByCategory(CategoryEnum enumcategoria){
		
		return lista;
	}

}


