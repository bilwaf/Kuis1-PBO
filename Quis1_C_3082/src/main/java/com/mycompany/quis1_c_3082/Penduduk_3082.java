/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_c_3082;

/**
 *
 * @author ASUS ZenBook
 * NABILA WAFAA YULISTYANINGRUM
 * 21103082
 * S1SI05C
 */

public class Penduduk_3082 {
  String nik_3082;
  String nama_3082;
  int umur_3082;
  String alamat_3082;

    public Penduduk_3082(String nik_3082, String nama_3082, int umur_3082, String alamat_3082) {
        this.nik_3082 = nik_3082;
        this.nama_3082 = nama_3082;
        this.umur_3082 = umur_3082;
        this.alamat_3082 = alamat_3082;
    }
  
  public void tampilDataPenduduk_3082(){
      System.out.println("=========Data Penduduk=========");
      System.out.println();
      System.out.println("NIK    : " + nik_3082);
      System.out.println("Nama   : " + nama_3082);
      System.out.println("Umur   : " + umur_3082);
      System.out.println("Alamat : " + alamat_3082);
  }
}
