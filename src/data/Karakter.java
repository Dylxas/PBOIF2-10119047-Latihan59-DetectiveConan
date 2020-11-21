/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENAMPILKAN KARAKTER DETECTIVE CONAN
 */

public class Karakter extends Detective{
    
    private String keahlian;

    public Karakter(String nama, String asal, boolean detective, String keahlian) {
        super(nama, asal, detective);
        this.keahlian = keahlian;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void tampilKarakter() {
        System.out.println("Nama : " +getNama());
        System.out.println("Dari : " +getAsal());
        if(isDetective()) {
            System.out.println("Detective : Iya");
        } else {
            System.out.println("Detective : Tidak");
        }
        System.out.println("Keahlian : " + getKeahlian());
        System.out.println();
    }
}
