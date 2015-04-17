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
public class Tnkb {
 private String kodeWilayah1;
    private String nomor;
    private String kodeWilayah2;

    /**
     * @return the kodeWilayah1
     */
    public String getKodeWilayah1() {
        return kodeWilayah1;
    }

    /**
     * @param kodeWilayah1 the kodeWilayah1 to set
     */
    public void setKodeWilayah1(String kodeWilayah1) {
        if (kodeWilayah1.length() > 0
                && kodeWilayah1.length() <= 2) {
            this.kodeWilayah1 = kodeWilayah1;
        }
    }

    /**
     * @return the nomor
     */
    public String getNomor() {
        return nomor;
    }

    /**
     * @param nomor the nomor to set
     */
    public void setNomor(String nomor) throws Exception {
        try{
            Integer.parseInt(nomor);
        } catch (Exception e){
            throw new Exception("Harus berupa angka semua");
        }
        this.nomor = nomor;
    }

    /**
     * @return the kodeWilayah2
     */
    public String getKodeWilayah2() {
        return kodeWilayah2;
    }

    /**
     * @param kodeWilayah2 the kodeWilayah2 to set
     */
    public void setKodeWilayah2(String kodeWilayah2) {
        this.kodeWilayah2 = kodeWilayah2;
    }
}

