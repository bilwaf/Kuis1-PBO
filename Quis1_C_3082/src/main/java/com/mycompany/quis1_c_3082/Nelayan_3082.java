/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_c_3082;

/**
 *
 * @author ASUS ZenBook
 * NABILA WAFAA' YULISTYANINGRUM
 * 21103082
 * S1SI05C
 */

public class Nelayan_3082 extends Penduduk_3082 {
    int jmlhBeratIkan_3082;
    int jmlhSolar_3082;
    double totalPendapatanNelayan_3082;

    public Nelayan_3082(int jmlhBeratIkan_3082, int jmlhSolar_3082, double totalPendapatanNelayan_3082, String nik_3082, String nama_3082, int umur_3082, String alamat_3082) {
        super(nik_3082, nama_3082, umur_3082, alamat_3082);
        this.jmlhBeratIkan_3082 = jmlhBeratIkan_3082;
        this.jmlhSolar_3082 = jmlhSolar_3082;
        this.totalPendapatanNelayan_3082 = totalPendapatanNelayan_3082;
    }
    
    public double totalPendapatanNelayan_3082()
    { 
        return totalPendapatanNelayan_3082 = (jmlhBeratIkan_3082 * 8000) - 
                (jmlhSolar_3082 * 10000);
    }
    
    public void DataNelayan_3082()
    {
        System.out.println("Jumlah Berat Ikan   : " + jmlhBeratIkan_3082);
        System.out.println("Jumlah Pakai Solar  : " + jmlhSolar_3082);
        System.out.println("Total Pendapatan    : " + totalPendapatanNelayan_3082);
    }
}
