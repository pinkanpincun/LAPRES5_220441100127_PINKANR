/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author LENOVO
 */
public class OperasiPerkalian extends OperasiBilangan {
     protected double a,b,c,d;
    protected void set_A(double A){
        a=A;
    }
    protected void set_B(double B){
        b=B;
    }
    protected void set_C(double C){
        c=C;
    }
    protected void set_D(){
        d = a * b * c;
    }
    protected double get_A(){
        return a;
    }
    protected double get_B(){
        return b;
    }
    protected double get_C(){
        return c;
    }
    protected double get_D(){
        return d;
    }
    protected void tampil(){
         System.out.println("Perkalian :");
       System.out.println(a+"*"+b+"*"+c+"="+d+"\n");
    }
}
