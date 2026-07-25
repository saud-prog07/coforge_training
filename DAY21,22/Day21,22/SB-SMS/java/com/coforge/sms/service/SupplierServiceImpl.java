package com.coforge.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.coforge.sms.exception.SupplierNotFoundException;
import com.coforge.sms.model.Suppliers;
import com.coforge.sms.repo.SupplierRepo;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Service
public class SupplierServiceImpl implements SupplierService {

	private SupplierRepo repo;
	private Environment environment;

	@Autowired
	public SupplierServiceImpl(SupplierRepo repo, Environment environment) {
		super();
		this.repo = repo;
		this.environment = environment;
	}

	@Override
	public boolean saveSupplier(Suppliers supplierId) {
		repo.save(supplierId);
		return true;
	}

	@Override
	public List<Suppliers> findAll() {

		List<Suppliers> list = (List<Suppliers>) repo.findAll();
		return list;
	}

	@Override
	public Optional<Suppliers> findBysupplierId(@Valid long supplierId) {
		
		if (!repo.existsById((int)supplierId)) {
			throw new SupplierNotFoundException(environment.getProperty("pms.invalid.employee-notfound"));
		}
		Optional<Suppliers> products = repo.findById((int)supplierId);
		return products;
	}
	
	@Override
	public boolean updateSupplier(@Valid int supplierId, @Valid Suppliers supplier) {
		if (!repo.existsById(supplierId)) {
			throw new SupplierNotFoundException(environment.getProperty("pms.invalid.employee-notfound"));
		}
		repo.save(supplier);
		return true;
	}

	@Override
	public boolean deleteBysupplierId(@Valid int supplierId) {
		if (!repo.existsById(supplierId)) {
			throw new SupplierNotFoundException(environment.getProperty("pms.invalid.employee-notfound"));
		}
		repo.deleteById(supplierId);
		return true;
	}
}
