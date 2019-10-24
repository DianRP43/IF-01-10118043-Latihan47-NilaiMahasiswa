/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class NilaiMahasiswa {
    private double qiuz,uts,uas;

    public double getQiuz() {
        return qiuz;
    }

    public void setQiuz(double qiuz) {
        this.qiuz = qiuz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    public double NilaiAkhir(double qiuz, double uts, double uas){
        return ((20 * qiuz)/100)+((30 * uts)/100)+((50 * uas)/100) ;        
    }
    public void cetak(double NilaiAkhir){
        if ((NilaiAkhir >= 80)&&(NilaiAkhir<=100)) {
            System.out.println("Index\t : A");
            System.out.println("Keterangan :SangatBaik");
        } else if ((NilaiAkhir >= 60)&&(NilaiAkhir<80)) {
            System.out.println("Index\t : B");
            System.out.println("Keterangan :Baik");
    } else if ((NilaiAkhir >= 40)&&(NilaiAkhir<60)) {
            System.out.println("Index\t : C");
            System.out.println("Keterangan :Cukup");
    } else if ((NilaiAkhir >= 20)&&(NilaiAkhir<40)) {
            System.out.println("Index\t : D");
            System.out.println("Keterangan :Kurang");
    } else if ((NilaiAkhir >= 0)&&(NilaiAkhir<20)) {
            System.out.println("Index\t : E");
            System.out.println("Keterangan :SangatKurang");
    }
    }
}