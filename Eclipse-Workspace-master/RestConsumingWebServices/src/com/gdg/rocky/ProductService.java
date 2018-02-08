package com.gdg.rocky;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

public class ProductService {
	
	ProductDao productDao;

	public ProductService() {
		productDao = ProductDao.instance;
	}

	public void createProduct(Product product) {
		productDao.getProducts().put(product.getId(), product);
	}

	public Product getProduct(String id) {
		return productDao.getProducts().get(id);
	}

	public Map<String, Product> getProducts() {
		return productDao.getProducts();
	}

	public List<Product> getProductAsList() {
		List<Product> productList = new ArrayList<Product>();
		productList.addAll(productDao.getProducts().values());
		return productList;
	}

	public int getProductsCount() {
		return productDao.getProducts().size();
	}

	public void deleteProduct(String id) {
		productDao.getProducts().remove(id);
	}
}
