package com.xrf.product.view.service;

import com.xrf.product.view.client.ProductClientFeign;
import com.xrf.product.view.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
	@Autowired
	ProductClientFeign productClientFeign;
	public List<Product> listProducts(){
		return productClientFeign.listProdcuts();

	}
}
