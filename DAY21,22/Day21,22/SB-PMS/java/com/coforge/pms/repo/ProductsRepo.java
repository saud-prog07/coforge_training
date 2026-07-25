package com.coforge.pms.repo;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coforge.pms.model.Products;

public interface ProductsRepo extends CrudRepository<Products,Integer>{
}
