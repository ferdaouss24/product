package controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entities.Product;

import service.ProductServiceLocal;

@ManagedBean
@ViewScoped
public class ProductController {
	
	@EJB
	private	ProductServiceLocal productServiceLocal;
	private List<Product> products;
	private Product selectProduct=new Product();
	private Product newProduct=new Product();

	public ProductController() {
	}
	@PostConstruct
	public void init(){
			products=productServiceLocal.listProducts();
	}
	public void addProduct(){
		productServiceLocal.addProduct(newProduct);
		newProduct=new Product();
	}
	public void removeProduct(){
		productServiceLocal.removeProduct(selectProduct);
	}
	public void updateProduct(){
		productServiceLocal.updateProduct(selectProduct);
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product getSelectProduct() {
		return selectProduct;
	}

	public void setSelectProduct(Product selectProduct) {
		this.selectProduct = selectProduct;
	}
	public Product getNewProduct() {
		return newProduct;
	}
	public void setNewProduct(Product newProduct) {
		this.newProduct = newProduct;
	}

}
