/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rental.mobil;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author acer
 */
public class RentalMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Petugas penjaga1 = new Petugas();
        try{

    penjaga1.setId("D391R46");
    penjaga1.setNama("Jonny W. Wilson");
           
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    Tnkb tnkb1 = new Tnkb();
    try{
        
    
    tnkb1.setKodeWilayah1("D");
    tnkb1.setKodeWilayah2("JC");
    tnkb1.setNomor("2289");
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    
    Mobil mobil1 = new Mobil();
    try{
    mobil1.setTipe("Isuzu Panther");
    mobil1.setTnkb(tnkb1);
    mobil1.setSewa(150000);
        
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    
        
    Penyewa penyewa1 = new Penyewa ();
    try{
    penyewa1.setAlamat("Jln. Rangkasbitung No. 10");
    penyewa1.setId("1517623497977");
    penyewa1.setNama("Johnson S. Smith");
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    
    
    
    
    Transaksi transaksi1 = new Transaksi ();
    transaksi1.setMobil(mobil1);
    transaksi1.setPenyewa(penyewa1);
    transaksi1.setPetugas(penjaga1);
    transaksi1.setTnkb(tnkb1);
    
    PrintTransaksi(transaksi1);
 
}
public static void PrintTransaksi(Transaksi transaksi) {
 System.out.println(transaksi.getPenyewa().getNama());
 System.out.println(transaksi.getPenyewa().getAlamat());
 System.out.println(transaksi.getMobil().getTipe());
 System.out.println(transaksi.getMobil().getSewa());
 System.out.println(transaksi.getPetugas().getNama());
 System.out.println(transaksi.getPetugas().getId());}
}
