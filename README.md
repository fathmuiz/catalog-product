# Catalog product

Aplikasi Java sederhana untuk mengelola katalog produk menggunakan Maven.

## Fitur

- Menambahkan dan menampilkan produk
- mencari produk berdasarkan ID
- Menghapus produk berdasarkan ID
- Menangani produk yang tidak ditemukan dengan custom exception

## Teknologi

- Java
- Maven

## Menjalankan aplikasi

dari folder project yang berisi 'pom.xml', jalankan:

```bash
mvn org.codehaus.mojo:exec-maven-plugin:3.5.0:java -Dexec.mainClass=com.budiluhur.catalog.App
