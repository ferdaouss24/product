package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



import entities.Product;

/**
 * Session Bean implementation class PersonService
 */
@Stateless
public class ProductService implements ProductServiceLocal {
	@PersistenceContext
	EntityManager em;

    public ProductService() {
        // TODO Auto-generated constructor stub
    }
@Override
public void addProduct (Product product){
	
	em.persist(product);
	
}

@Override
public void removeProduct (Product product)
{
em.remove(product)	;

}
@Override
public void updateProduct (Product product){
	em.merge(product);
	
}
@Override
public List<Product> listProducts()
{
Query query=em.createQuery("select p from Product p");
return query.getResultList() ;
}

}


