package com.xrf.product.view.client;

import com.xrf.product.view.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "PRODUCT-DATA-SERVICE",fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {

	@GetMapping("/products")
	public List<Product> listProdcuts();
}
