/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul5;

/**
 *
 * @author LENOVO
 */
public class OperasiBilanganCetak {
public static void main(String[] args) {
        
    OperasiPenjumlahan jumlah = new OperasiPenjumlahan();
    OperasiPengurangan kurang = new OperasiPengurangan();
    OperasiPerkalian kali = new OperasiPerkalian();
    OperasiPembagian bagi = new OperasiPembagian();
    
    OperasiBilangan[]f = {jumlah,kurang,kali,bagi};  
    cetakSemua(f, 10.5,0.5,1.25 );
    
    
    }
    private static void cetakSemua(OperasiBilangan[]OB,double a,double b, double c){
        for (int i = 0; i < OB.length; i++) {
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].set_C(c);
            OB[i].set_D();
            OB[i].tampil();
        }
    }
}
