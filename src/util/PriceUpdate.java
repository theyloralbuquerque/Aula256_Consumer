package util;

import java.util.function.Consumer;

import entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) { // Método do contrato da interface Consumer.
		p.setPrice(p.getPrice() * 1.1);
	}
}