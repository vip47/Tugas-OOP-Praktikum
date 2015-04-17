/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rental.mobil;

/**
 *
 * @author acer
 */
public class Mobil {
    private String tipe;
    private Tnkb tnkb;
    private int sewa;
  
    void setTnkb (Tnkb tnkb){
        this.tnkb=tnkb;
       }
  void setTipe (String tipe) throws Exception {
       if (tipe.equalsIgnoreCase("Toyota Avanza")||
               tipe.equalsIgnoreCase("Toyota Innova")||
               tipe.equalsIgnoreCase("Toyota Camry")||
               tipe.equalsIgnoreCase("Toyota Vios")||
               tipe.equalsIgnoreCase("Toyota Alphard")||
               tipe.equalsIgnoreCase("Suzuki APV")||
               tipe.equalsIgnoreCase("Suzuki Escudo")||
               tipe.equalsIgnoreCase("Nissan Navara")||
               tipe.equalsIgnoreCase("Nissan Juke")||
               tipe.equalsIgnoreCase("Isuzu D-Max")||
               tipe.equalsIgnoreCase("Isuzu Panther")){
           this.tipe = tipe;
    }
       else { throw new Exception ("Tidak terdapat tipe tersebut"); }}
    /**
     * @return the tipe
     */
    public String getTipe() {
        return tipe;
    }

    /**
     * @return the tnkb
     */
    public Tnkb getTnkb() {
        return tnkb;
    }
    /**
     * @return the sewa
     */
    public long getSewa() {
        return sewa;
    }

    /**
     * @param sewa the sewa to set
     */
    public void setSewa(int sewa) throws Exception {
     if (sewa>100000&&sewa<=500000){
         this.sewa= sewa;
     }
     else{
         throw new Exception("harga sewa diantara 100 ribu sampai 500rb");
     }
    }
}
