/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author HP
 */
// Custom Exception
// Custom Exception untuk cek Nama
class NamaKosongException extends Exception {
    public NamaKosongException(String pesan) {
        super(pesan);
    }
}

public class Nama {
    // Method untuk cek Nama
    public static void periksaNama(String nama) throws NamaKosongException {
        if (nama == null || nama.trim().isEmpty()) {
            throw new NamaKosongException("Nama tidak boleh kosong!");
        }
        System.out.println("Nama valid: " + nama);
    }

    public static void main(String[] args) {
        try {
            periksaNama("Nola");   // contoh input
        } catch (NamaKosongException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}

