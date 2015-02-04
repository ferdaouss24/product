package service;

import java.util.List;

import javax.ejb.Local;

import entities.Product;

@Local 
public interface ProductServiceLocal {

	public void addProduct(Product product);

	public void removeProduct(Product product);

	public void updateProduct(Product product);

	public List<Product> listProducts();

}
