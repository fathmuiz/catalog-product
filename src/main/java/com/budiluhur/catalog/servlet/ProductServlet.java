package com.budiluhur.catalog.servlet;

import com.budiluhur.catalog.model.Product;
import com.budiluhur.catalog.repository.ProductRepository;
import com.budiluhur.catalog.exception.ProductNotFoundException;

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

        String id = request.getParameter("id");

        if (id != null && !id.trim().isEmpty()) {

            try {
                Product product = productRepository.findById(id);

                out.println("<html>");
                out.println("<head><title>Detail Produk</title></head>");
                out.println("<body>");

                out.println("<h2>Detail Produk</h2>");
                out.println("<p>ID Produk: " + product.getId() + "</p>");
                out.println("<p>Nama Produk: " + product.getName() + "</p>");
                out.println("<p>Harga: Rp: " + product.getPrice() + "</p>");

                out.println("<a href='/products'>Kembali ke katalog</a>");

                out.println("</body>");
                out.println("</html>");


            } catch (ProductNotFoundException e) {

                response.setStatus(HttpServletResponse.SC_NOT_FOUND);

                out.println("<html>");
                out.println("<head><title>Produk Tidak Ditenukan</title></head>");
                out.println("<body>");

                out.println("<h2 style='color: red;'>Produk Tidak Ditemukan</h2>");
                out.println("<p style='color: red;'>" + "Produk dengan ID " + id + " tidak ditemukan.</p>");

                out.println("<a href='/products'>Kembali ke Katalog</a>");

                out.println("</body>");
                out.println("</html>");
            }

            return;
        }

        List<Product> products = productRepository.findAll();

        out.print("<html>");
        out.print("<head><title>Katalog " + "Produk Web</title></head>");
        out.println("<body>");
        out.println("<h2>=== DAFTAR KATALOG" + "PRODUK (WEB) ===</h2>");
        out.println("<table border='1'" + "cellpadding='8'>");
        out.println("<tr><th>ID Produk</th>" + "<th>Nama Produk</th><th>Harga " + "Satuan</th></tr>");

        for (Product p : products) {
            out.println("<tr>");
            out.println("<td>" + p.getId() + "</td>");
            out.println("<td>" + p.getName() + "</td>");
            out.println("<td>" + p.getPrice() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
