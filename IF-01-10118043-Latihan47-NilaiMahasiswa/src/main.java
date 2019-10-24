
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa NM = new NilaiMahasiswa();
        double q,uts,uas;
        Scanner input = new Scanner(System.in);
        System.out.println("Judul");
        System.out.println("-----");
        System.out.println("Quis : ");
        q = input.nextDouble();
        NM.setQiuz(q);
        System.out.println("UTS  : ");
        uts = input.nextDouble();
        NM.setUts(uts);
        System.out.println("UAS  : ");
        uas= input.nextDouble();
        NM.setUas(uas);
        System.out.println("Nilai Akhir : "+NM.NilaiAkhir(q, uts, uas) );
        NM.cetak(uas);
        
        
    }
    
}
