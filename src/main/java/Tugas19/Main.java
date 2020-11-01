/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas19;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author 
 * Aris Prabowo
 * 10119914 - IF10K
 */
public class Main {
    public static void main(String[] args) {
       Scanner Keyboard = new Scanner(System.in);
       double SaldoAwal;
       int LamaBulan;
       double bunga;
       
       System.out.println("==============Program Bunga=======");
       
       System.out.println("Saldo Awal : ");
       SaldoAwal = Keyboard.nextDouble();
       
       System.out.println("Lama Menabung : ");
       LamaBulan = Keyboard.nextInt();
       
       System.out.println("Besaran Bunga : ");
       bunga = Keyboard.nextFloat()/100;
       
       //Make IDR Currency
       Locale localeID = new Locale("in", "ID");
       NumberFormat Rupiah = NumberFormat.getCurrencyInstance(localeID);
       Rupiah.setMaximumFractionDigits(0);
       Rupiah.setMinimumFractionDigits(0);
       
       System.out.println("\n==============Hasil Perhitungan=======");
       for(var i = 0; i < LamaBulan; i++){
            SaldoAwal = Math.floor((bunga*SaldoAwal)+SaldoAwal);
            String SaldoAwalRupiah = Rupiah.format(SaldoAwal);
            System.out.println("Saldo di bulan ke-"+(i+1)+" "+SaldoAwalRupiah);
       }
    }
}