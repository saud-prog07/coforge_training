package com.coforge.pms.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.coforge.pms.model.Product;

@Service
public class ProductService {
	private Map<Integer,Product> map = new HashMap<>();

	public boolean addProduct(Product product) {
		
		boolean status = false;
		if(map.containsKey(product.getProductId())) {
			return false;
		}else {
		map.put(product.getProductId(),product);
		return true;
	}
}

	public boolean updateProduct(Product product) {

	    if (map.containsKey(product.getProductId())) {
	        map.put(product.getProductId(), product);
	        return true;
	    }

	    return false;
	}

	public boolean deleteProduct(int pid) {
		boolean status = false;

			if(map.containsKey(pid)) {
				map.remove(pid);
				return true;
			}
		return false;
	}

	public Product findProduct(int pid) {
		Product prd = null;
			if(map.containsKey(pid)) {
				return prd = map.get(pid);
			}else {
		return null;
	}
}

	public Map<Integer,Product> findAll() {
		return map;
	}

}
