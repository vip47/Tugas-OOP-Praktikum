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
public class Transaksi {
    private Penyewa penyewa;
    private Mobil mobil;
    private Petugas petugas;
    private Tnkb tnkb;

    /**
     * @return the penyewa
     */
    public Penyewa getPenyewa() {
        return penyewa;
    }

    /**
     * @param penyewa the penyewa to set
     */
    public void setPenyewa(Penyewa penyewa) {
        this.penyewa = penyewa;
    }

    /**
     * @return the mobil
     */
    public Mobil getMobil() {
        return mobil;
    }

    /**
     * @param mobil the mobil to set
     */
    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    /**
     * @return the petugas
     */
    public Petugas getPetugas() {
        return petugas;
    }

    /**
     * @param petugas the petugas to set
     */
    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    /**
     * @return the tnkb
     */
    public Tnkb getTnkb() {
        return tnkb;
    }

    /**
     * @param tnkb the tnkb to set
     */
    public void setTnkb(Tnkb tnkb) {
        this.tnkb = tnkb;
    }
    
}
