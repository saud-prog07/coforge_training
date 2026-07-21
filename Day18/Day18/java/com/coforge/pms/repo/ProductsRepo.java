package com.coforge.pms.repo;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coforge.pms.model.Products;

public interface ProductsRepo extends CrudRepository<Products,Integer>{
	public List<Products> findByPname(String pname);
	public List<Products> findByPrice(float price);
	public List<Products> findByPquantity(int pquantity);
	public List<Products> deleteByPname(String pname); 
	
	@Query("SELECT p FROM Products p WHERE p.price BETWEEN :minPrice AND :maxPrice")
	List<Products> getProductsByPrice(@Param("minPrice") double minPrice,
	                                  @Param("maxPrice") double maxPrice);
}
