package br.com.foursys.fourcamp.fourstore.comunication;

import java.util.Scanner;

import br.com.foursys.fourcamp.fourstore.controller.ProductController;

public class Menu {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		 Integer opcao = 99;
	
		while (opcao != 0) {
			System.out.println("\n Digite uma opção" + "\n 1- cadastrar produto" +  "\n  2- Buscar Produto" + "3- estoque por sku" + "\n 0- sair");
			  opcao = sc.nextInt();
		
			switch (opcao) {

			case 1:
				cadProduct();
				break;
			case 2:
				productSku();
				break;
			case 3:
				listarEstoque();
			}

		}

	}


		private static void cadProduct() {
		ProductController productCont = new ProductController();
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o sku do produto");
		String sku = sc.nextLine();
		System.out.println("Insira a quantidade do produto");
		Integer quantity = sc.nextInt();
		sc.nextLine();
		System.out.println("Qual o produto: ");
		String descricao = sc.nextLine();
		System.out.println("Insira o preço original do produto");
		Double original = sc.nextDouble();
		System.out.println("Insira o valor de venda do produto");
		Double venda = sc.nextDouble();

		Object retorno = productCont.cadProduct(sku, quantity, original, venda, descricao);
		System.out.println(retorno);

	}
	private static void productSku() {
		ProductController productCont = new ProductController();
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o sku do produto");
		String sku = sc.nextLine();
		
		Object retorno = productCont.productSku(sku);
		System.out.println(retorno);

		
		
	}
	private static void listarEstoque() {
		ProductController productCont = new ProductController();
	
		String productlist = productCont.listproducts();
		
	}
}
