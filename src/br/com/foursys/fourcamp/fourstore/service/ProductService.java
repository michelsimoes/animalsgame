package br.com.foursys.fourcamp.fourstore.service;

import java.util.List;

import br.com.foursys.fourcamp.fourstore.data.ProductData;
import br.com.foursys.fourcamp.fourstore.model.Product;

public class ProductService {
    ProductData data = new ProductData();
    
   
      public boolean cadProduct(Product product) {
    	  boolean retorno = true;
    	 Object verify = data.getById(product.getId());
    	 if(verify == null) {
    	 data.save(product);
       	  retorno = true;
       	 }else{
       		 Product verify2 =  (Product) verify;
       		 product.setQtt(verify2.getQtt() + product.getQtt());
       		 data.update(product);
       		 retorno = true;
       		 
       	 }
    	 return retorno;
    	  
    	  
      }
	public Product productSku(Product product) {
	Product verifySku = (Product) data.getById(product.getId());
	 return verifySku;
		
	}
	
	
	
	public List<Object> listProducts() {
		
		return  data.listAll();
	}
      

}
