package com.budiluhur.catalog.servlet;

import com.budiluhur.catalog.model.Product;
import com.budiluhur.catalog.repository.ProductRepository;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
    private ProductRepository productRepository;

    @Override
    public void init() {
        //Inisiasi Repository dan data awal
        productRepository = new ProductRepository();
        productRepository.addProduct(new Product("PRD-01", "Keyboard Mechanical", 450000.0));
        productRepository.addProduct(new Product("PRD-02", "Mouse Wireless Silent", 175000.0));
        productRepository.addProduct(new Product("PRD-03", "Monitor Gaming 24 inch", 2100000.0));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        List<Product> products = productRepository.findAll();

        out.print("<html>");
        out.print("<head><title>Katalog " + "Produk Web</title></head>");
        out.println("<body>");
        out.println("<h2>=== DAFTAR KATALOG" + "PRODUK (WEB) ===</h2>");
        out.println("<table>");
    }
}
