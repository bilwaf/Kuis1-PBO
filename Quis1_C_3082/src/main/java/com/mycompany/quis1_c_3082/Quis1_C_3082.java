/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quis1_c_3082;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author ASUS ZenBook
 * NABILA WAFAA' YULISTYANINGRUM
 * 21103082
 * S1SI05C
 */

public class Quis1_C_3082 {

    public static void main(String[] args) {
        Nelayan_3082 nlyn1_3082 = new Nelayan_3082(0,0,0,"","",0,"");
        Nelayan_3082 nlyn2_3082 = new Nelayan_3082(0,0,0,"","",0,"");
        Dokter_3082 dktr1_3082 = new Dokter_3082(0,0,0,"","",0,"");
        Dokter_3082 dktr2_3082 = new Dokter_3082(0,0,0,"","",0,"");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.println("NIK                : ");
            nlyn1_3082.nik_3082 = br.readLine();
            System.out.println("Nama               : ");
            nlyn1_3082.nama_3082 = br.readLine();
            System.out.println("Umur               : ");
            nlyn1_3082.umur_3082 = Integer.parseInt(br.readLine());
            System.out.println("Alamat             : ");
            nlyn1_3082.alamat_3082 = br.readLine();
            System.out.println("Jumlah Berat Ikan  : ");
            nlyn1_3082.jmlhBeratIkan_3082 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Pakai Solar : ");
            nlyn1_3082.jmlhSolar_3082 = Integer.parseInt(br.readLine());
            
            System.out.println("");
            
            System.out.println("NIK                : ");
            nlyn2_3082.nik_3082 = br.readLine();
            System.out.println("Nama               : ");
            nlyn2_3082.nama_3082 = br.readLine();
            System.out.println("Umur               : ");
            nlyn2_3082.umur_3082 = Integer.parseInt(br.readLine());
            System.out.println("Alamat             : ");
            nlyn2_3082.alamat_3082 = br.readLine();
            System.out.println("Jumlah Berat Ikan  : ");
            nlyn2_3082.jmlhBeratIkan_3082 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Pakai Solar : ");
            nlyn2_3082.jmlhSolar_3082 = Integer.parseInt(br.readLine());
            
            System.out.println("");
            
            System.out.println("NIK           : ");
            dktr1_3082.nik_3082 = br.readLine();
            System.out.println("Nama          : ");
            dktr1_3082.nama_3082 = br.readLine();
            System.out.println("Umur          : ");
            dktr1_3082.umur_3082 = Integer.parseInt(br.readLine());
            System.out.println("Alamat        : ");
            dktr1_3082.alamat_3082 = br.readLine();
            System.out.println("Jumlah Pasien : ");
            dktr1_3082.jmlhPasien_3082 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Obat   : ");
            dktr1_3082.jmlhObat_3082 = Integer.parseInt(br.readLine());
            
            System.out.println("");
            
            System.out.println("NIK           : ");
            dktr2_3082.nik_3082 = br.readLine();
            System.out.println("Nama          : ");
            dktr2_3082.nama_3082 = br.readLine();
            System.out.println("Umur          : ");
            dktr2_3082.umur_3082 = Integer.parseInt(br.readLine());
            System.out.println("Alamat        : ");
            dktr2_3082.alamat_3082 = br.readLine();
            System.out.println("Jumlah Pasien : ");
            dktr2_3082.jmlhPasien_3082 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Obat   : ");
            dktr2_3082.jmlhObat_3082 = Integer.parseInt(br.readLine());
            
            System.out.println("========== DATA NELAYAN ==========");
            nlyn1_3082.tampilDataPenduduk_3082();
            nlyn1_3082.totalPendapatanNelayan_3082();
            nlyn1_3082.DataNelayan_3082();
            
            System.out.println("");
            
            nlyn2_3082.tampilDataPenduduk_3082();
            nlyn2_3082.totalPendapatanNelayan_3082();
            nlyn2_3082.DataNelayan_3082();
            
            System.out.println("");
            
            System.out.println("========== DATA DOKTER ==========");
            dktr1_3082.tampilDataPenduduk_3082();
            dktr1_3082.totalPendapatanDokter_3082();
            dktr1_3082.DataDokter_3082();
            
            System.out.println("");
            dktr2_3082.tampilDataPenduduk_3082();
            dktr2_3082.totalPendapatanDokter_3082();
            dktr2_3082.DataDokter_3082();
        }
        catch(IOException x)
        {
            System.out.println(x);
        }
    }
}
