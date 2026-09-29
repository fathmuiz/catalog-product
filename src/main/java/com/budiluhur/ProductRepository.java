package com.budiluhur.catalog.repository;

import com.budiluhur.catalog.model.Product;
import com.budiluhur.catalog.exception.ProductNotFoundException;

public class ProductRepository {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> findAll() {
        return productList;
    }

    public Product findById(String id) throws ProductNotFoundException {
        fot (product p: productList) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        throws new ProductNotFoundException("Produk dengan ID" + id + "tidak ditemukan!");
    }
}
