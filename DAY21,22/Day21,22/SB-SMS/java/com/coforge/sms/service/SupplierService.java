package com.coforge.sms.service;

import java.util.List;
import java.util.Optional;
import com.coforge.sms.model.Suppliers;

import jakarta.validation.Valid;

public interface SupplierService {

	boolean saveSupplier(@Valid Suppliers supplier);

	List<Suppliers> findAll();

	Optional<Suppliers> findBysupplierId(@Valid long supplierId);

	boolean updateSupplier(@Valid int supplierId, @Valid Suppliers supplier);

	boolean deleteBysupplierId(@Valid int supplierId);
}
