/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.atep;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    fasilitas perintah = new fasilitas();
        barang atk = new barang();
            atk.setKode_barang("B002");
            atk.setNama_barang("Buku Tulis");
            atk.setJumlah(12);
            atk.setHarga(3000);
        //perintah.update(atk);
        //perintah.insert(atk);
       perintah.delete("B002");
       
       //select all
       List<barang> list = perintah.selectAll();
       for(barang barang : list){
           System.out.println(barang.getKode_barang());
           System.out.println(barang.getNama_barang());
           System.out.println(barang.getJumlah());
           System.out.println(barang.getHarga());
           System.out.println("-------------------------");
       }

}
}
    
    

