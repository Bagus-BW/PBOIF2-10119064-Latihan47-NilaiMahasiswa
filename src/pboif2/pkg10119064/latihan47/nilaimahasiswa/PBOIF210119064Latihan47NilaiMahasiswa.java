/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan47.nilaimahasiswa;

import model.Nilai;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menentukan nilai akhir
 * mahasiswa dan index nilai
 */
public class PBOIF210119064Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek nilai
        Nilai nilai = new Nilai(100, 100, 39);
        
        nilai.tampil(nilai.getQuiz(), 
                     nilai.getUts(), 
                     nilai.getUas(), 
                     nilai.getNilaiAkhir(nilai.getQuiz(), 
                                         nilai.getUts(),
                                         nilai.getUas()), 
                     nilai.getindex(nilai.getNilaiAkhir(nilai.getQuiz(), 
                                                        nilai.getUts(),
                                                        nilai.getUas())));
    }
    
}
