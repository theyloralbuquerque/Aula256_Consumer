package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.forEach(Product::staticPriceUpdate); // forEach() percorre toda a cole��o e executando um Consumer chamando o m�todo staticPriceUpdate para cada elemento.

		list.forEach(System.out::println); // Refrence Method para executar o println.
	}
}