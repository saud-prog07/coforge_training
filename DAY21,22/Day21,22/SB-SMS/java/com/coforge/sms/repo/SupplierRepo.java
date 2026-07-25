package com.coforge.sms.repo;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.coforge.sms.model.Suppliers;

public interface SupplierRepo extends CrudRepository<Suppliers,Integer>{
	
}
