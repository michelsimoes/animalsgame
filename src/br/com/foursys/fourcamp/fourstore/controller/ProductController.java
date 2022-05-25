package br.com.foursys.fourcamp.fourstore.controller;

import java.util.List;

import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.service.ProductService;

public class ProductController {
	
	ProductService service = new ProductService();
	
	
	public Object cadProduct(String sku, Integer qtt, Double originalprice, Double saleprice,String description) {
		
		String retorno = null;
		Product product = new Product(sku, originalprice,  saleprice, qtt, description);
		if(product != null) {
		if(product.getCategory() == null || product.getColor() == null || product.getType() == null || product.getDepartment() == null || product.getSize() == null) {
			 System.out.println("Sku invalido");
		}else {
			service.cadProduct(product);
			return product;
		}
		
		}
		
		
		
		return retorno;
		
		
		
			
	}


	public Object productSku(String sku) {
		Object retorno = "Produto não encontrado";
		Product product = new Product(sku);
		product = service.productSku(product);
		if(product == null) {
			return retorno;
			
			         
	}
		return retorno = "Produto encontrado"
				+ "descricao: " +  product.getDescription()
				+ "quantidade"   +  product.getQtt()
		        + "preco de compra"  +  product.getOriginalprice()
		        + "preco de venda"  +  product.getSaleprice();
		
			}


	public String listproducts() {
		String retorno = "produto encontrado";
		List<Object> lista = service.listproducts();
		for(int x = 0; x < lista.size(); x++) {
			Product product = (Product) lista.get(x);
		retorno = retorno + ""
				 		+"\n " +  product.getDescription()
					    + "n"   +  product.getQtt()
			            + "\n"  +  product.getOriginalprice()
			            + "\n"  +  product.getSaleprice();
			
		}
		return retorno;
	}



		
	}



	
	
	


