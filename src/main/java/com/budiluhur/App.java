package com.budiluhur;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("=======================================");
        System.out.println( "SISTEM KATALOG PRODUK ENTERPRISE v1.0" );
        System.out.println("=======================================");

        // Deklarasi variabel produk
        String productName = "Mouse Wireless Silent";
        double unitPrice = 175000.0;
        int stockQuantity = 12;

        // Memanggil method untuk menampilkan informasi
        printProductDetails(productName, unitPrice, stockQuantity);

        //Memeriksa status ketersedian
        boolean isAvailable = checkStockStatus(stockQuantity);
        System.out.println("Status Ketersediaan: " + (isAvailable ? "Tersedia" : "Stock Habis"));

        // Menghitung total harga
        double totalPrice = calculateTotalPrice(4, unitPrice);
        System.out.println("Total Harga: RP" + totalPrice);

    }

    public static void printProductDetails(String name, double price, int stock) {
        System.out.println("Nama Produk : " + name);
        System.out.println("Harga Satuan: RP" + price);
        System.out.println("Jumlah Stock: " + stock + " unit");
    }

    public static boolean checkStockStatus(int stock) {
        return stock > 0;
    }

    public static double calculateTotalPrice(int quantity, double price) {
        return quantity * price;

    }
}
