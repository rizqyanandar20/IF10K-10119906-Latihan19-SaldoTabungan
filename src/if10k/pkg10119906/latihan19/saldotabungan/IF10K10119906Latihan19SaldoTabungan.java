/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan19.saldotabungan;

import java.text.DecimalFormat;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * Kelas    : IF-10K
 * NIM      : 10119906
 * Deskripsi Program : menampilkan saldo setiap bulan (s.d bln ke 6), 
 * 
 */
public class IF10K10119906Latihan19SaldoTabungan {
    static int saldoAkhir;
    static void hitung(int a, int b){
        saldoAkhir = (a + (a*b/100));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        int saldoAwal = 2500000;
        double bunga = 0.15;
        int saldoBulanan;
        
        DecimalFormat df = new DecimalFormat("#,###,##0");
        
        do{
            saldoBulanan = (int) (bunga * saldoAwal);
            saldoAwal = (saldoAwal + saldoBulanan);
            System.out.println("Saldo di bulan ke-"+i+" Rp." +df.format(saldoAwal));
            i++;
        } while (i<=6);
    }
    
}
