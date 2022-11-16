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

public class Dokter_3082 extends Penduduk_3082 {
    int jmlhPasien_3082;
    int jmlhObat_3082;
    double totalPendapatanDokter_3082;

    public Dokter_3082(int jmlhPasien_3082, int jmlhObat_3082, double totalPendapatanDokter_3082, String nik_3082, String nama_3082, int umur_3082, String alamat_3082) {
        super(nik_3082, nama_3082, umur_3082, alamat_3082);
        this.jmlhPasien_3082 = jmlhPasien_3082;
        this.jmlhObat_3082 = jmlhObat_3082;
        this.totalPendapatanDokter_3082 = totalPendapatanDokter_3082;
    }
    
    public double totalPendapatanDokter_3082()
    {
        return totalPendapatanDokter_3082 = (jmlhPasien_3082 * 50000) +
                (jmlhObat_3082 * 10000);
    }
    
    public void DataDokter_3082()
    {
        System.out.println("Jumlah Pasien    : " + jmlhPasien_3082);
        System.out.println("Jumlah Obat      : " + jmlhObat_3082);
        System.out.println("Total Pendapatan : " + totalPendapatanDokter_3082);
    }
    
}
