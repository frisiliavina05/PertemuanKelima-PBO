# Custom Exception dan CRUD dengan Java Form
Pada praktikum lima ini membuat satu class Custom Exception untuk memeriksa input nama serta menangani kesalahan secara lebih terstruktur, serta membangun class DataMusik yang mengimplementasikan operasi CRUD (Create, Read, Update, Delete) menggunakan Java Form dengan antarmuka sederhana.

# 1.  Custom Exception
Exception adalah kondisi error yang terjadi saat program berjalan. Java memang sudah menyediakan banyak exception standar, namun terkadang aplikasi membutuhkan pengecualian khusus sesuai aturan bisnis tertentu. Dalam hal ini, programmer dapat membuat Custom Exception dengan mendefinisikan kelas baru yang mewarisi Exception atau RuntimeException, sehingga pesan kesalahan yang ditampilkan menjadi lebih spesifik, relevan, dan sesuai konteks aplikasi.

Manfaat penggunaan Custom Exception antara lain:
- Menyediakan pesan error yang lebih informatif dan sesuai konteks.
- Memudahkan proses pencarian dan perbaikan kesalahan (debugging).
- Membuat program lebih rapi, terstruktur, dan mudah dikelola.

Contoh Source Code :

        try {
            periksaNama("Nola");   // contoh input
        } catch (NamaKosongException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

Pada program ini, method periksaNama akan mengecek input nama yang dijalankan di dalam blok try. Jika nama kosong atau tidak diisi, maka akan dilemparkan ke dalam class NamaKosongException yang ditangkap oleh catch dan akan menampilkan pesan kesalahan.

# 2. CRUD dengan menggunakan Java Form
CRUD (Create, Read, Update, Delete) merupakan empat operasi dasar yang digunakan dalam pengolahan data pada sistem basis data. Dalam pemrograman Java, implementasi CRUD dapat dilakukan dengan memanfaatkan Java Swing sebagai antarmuka grafis (GUI) serta JDBC (Java Database Connectivity) untuk menghubungkan aplikasi dengan database, misalnya PostgreSQL.
- Create (Insert Data) : 
Digunakan untuk memasukkan data baru ke dalam tabel database. Data biasanya diinput melalui komponen seperti JTextField, lalu dikirim ke database menggunakan perintah INSERT INTO dengan bantuan PreparedStatement.
- Read (Menampilkan Data) : 
Digunakan untuk mengambil data dari database dan menampilkannya pada komponen JTable. Proses ini menggunakan query SELECT yang hasilnya diolah melalui ResultSet dan diubah menjadi TableModel, sehingga data bisa ditampilkan dengan rapi pada antarmuka.
- Update (Mengubah Data) : 
Digunakan untuk mengubah data yang sudah ada di dalam tabel. Operasi ini memanfaatkan query UPDATE yang dikombinasikan dengan PreparedStatement agar lebih aman serta mencegah terjadinya SQL Injection.
- Delete (Menghapus Data) : 
Digunakan untuk menghapus data yang tersimpan di tabel. Pada Java Form, biasanya ditambahkan dialog konfirmasi menggunakan JOptionPane sebelum menjalankan query DELETE, agar tidak terjadi penghapusan data secara tidak sengaja.
