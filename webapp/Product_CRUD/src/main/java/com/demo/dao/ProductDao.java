package com.demo.dao;


import java.util.List;

import com.demo.bean.Product;

public interface ProductDao {
	public void addProduct(Product p);
	public void updateProduct(Product p);
	public void deleteProduct(Product p);
    public Product searchproductById(Product p); 
    public List<Product> viewallproducts();
    
}
