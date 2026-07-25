package com.coforge.pms.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.pms.dto.SupplierDTO;

@FeignClient(name = "SB-SMS-SERVICE/api/v1/sms")
public interface SupplierClient {
	
	@GetMapping("/suppliers/{supplierId}")
	public SupplierDTO findSupplierDetails(@PathVariable("supplierId") Long supplierId);
}
