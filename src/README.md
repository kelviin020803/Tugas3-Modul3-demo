# Program Menu Kue

Program ini adalah aplikasi sederhana yang menampilkan daftar menu kue beserta informasi terkait, seperti nama, harga, deskripsi, ketersediaan, dan stok kue. Program ini ditulis dalam bahasa pemrograman Java.

## Fitur

- Menampilkan informasi lengkap tentang setiap kue.
- Memperbarui stok kue.
- Mengubah status ketersediaan kue.

## Struktur Kode

Program ini terdiri dari dua kelas utama:

1. **Main**: Kelas ini berisi metode `main` yang menjalankan program dan membuat objek dari kelas `MenuKue`.
2. **MenuKue**: Kelas ini mendefinisikan properti dan metode untuk mengelola informasi kue, seperti nama, harga, deskripsi, ketersediaan, dan stok.

## Cara Kerja Program

1. Program akan membuat objek `MenuKue` dengan berbagai atribut seperti nama, harga, deskripsi, ketersediaan, dan stok awal.
2. Metode `tampilkanMenu` digunakan untuk menampilkan informasi setiap kue ke layar.
3. Metode `updateStok` memungkinkan untuk menambahkan atau mengurangi stok kue.
4. Metode `setAvailability` mengatur ketersediaan kue.

## Cara Menjalankan Program

1. Pastikan Anda sudah memiliki JDK yang terinstal di komputer Anda.
2. Simpan kedua kelas, `Main.java` dan `MenuKue.java`, dalam direktori yang sama.
3. Buka terminal dan navigasikan ke direktori tempat file disimpan.
4. Jalankan perintah berikut untuk mengompilasi kedua kelas:

   ```bash
   javac Main.java MenuKue.java
