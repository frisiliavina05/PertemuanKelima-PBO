# Custom Exception dan CRUD dengan Java Form
Pada praktikum lima ini membuat satu class Custom Exception untuk memeriksa input nama serta menangani kesalahan secara lebih terstruktur, serta membangun class DataMusik yang mengimplementasikan operasi CRUD (Create, Read, Update, Delete) menggunakan Java Form dengan antarmuka sederhana.

# 1.  Custom Exception
Exception adalah kondisi error yang terjadi saat program berjalan. Java memang sudah menyediakan banyak exception standar, namun terkadang aplikasi membutuhkan pengecualian khusus sesuai aturan bisnis tertentu. Dalam hal ini, programmer dapat membuat Custom Exception dengan mendefinisikan kelas baru yang mewarisi Exception atau RuntimeException, sehingga pesan kesalahan yang ditampilkan menjadi lebih spesifik, relevan, dan sesuai konteks aplikasi.

Manfaat penggunaan Custom Exception antara lain:
- Menyediakan pesan error yang lebih informatif dan sesuai konteks.
- Memudahkan proses pencarian dan perbaikan kesalahan (debugging).
- Membuat program lebih rapi, terstruktur, dan mudah dikelola.
