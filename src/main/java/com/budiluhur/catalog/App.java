package com.budiluhur.catalog;

import com.budiluhur.catalog.model.Product;
import com.budiluhur.catalog.repository.ProductRepository;
import com.budiluhur.catalog.exception.ProductNotFoundException;

public class App {
    public static void main( String[] args ) {
        ProductRepository repo = new ProductRepository();

        repo.addProduct(new Product("PRD-01", "Keyboard Mechanical", 450000.0));
        repo.addProduct(new Product("PRD-02", "Mouse Wireless", 175000.0));

        System.out.println("=== DAFTAR SELURUK PRODUK ===");
        repo.findAll().forEach(System.out::println);

        System.out.println("\n=== PENCARIAN PRODUK ===");
        try {
            Product p = repo.findById("PRD-01"); //ID tidak ditemukan
            System.out.println("Ditemukan: " + p);
        } catch (ProductNotFoundException e) {
            System.err.println("Error Terjadi: " + e.getMessage());
        }

        System.out.println("\n=== HAPUS PRODUK ===");
        try {
            boolean idDeleted = repo.deleteById("PRD-01");
            System.out.println("Hapus Berhasil: " + idDeleted);

            System.out.println("\n=== DAFTAR SETELAH DIHAPUS ===");
            repo.findAll().forEach(System.out::println);

            repo.deleteById("PRD-01");

        } catch (ProductNotFoundException e) {
            System.err.println("Error Terjadi: " + e.getMessage());
        }
    }
}
