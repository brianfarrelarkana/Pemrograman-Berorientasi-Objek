/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */

/*Kelas Anak*/

public class Satpam extends Pegawai {
    
    public Satpam()
    {
        this.nama352 = "Data Kosong";
        this.nip352 = "Data Kosong";
        this.alamat352 = "Data Kosong";
        this.tahunMasuk352 = 0;
        this.gajiPokok352 = 0;
        this.jamLembur352 = 0;
    }
    
    public void setSatpam(String Nama352, String NIP352, String Alamat352, int TahunMasuk352, int GajiPokok352, int JamLembur352)
    {
        nama352 = Nama352;
        nip352 = NIP352;
        alamat352 = Alamat352;
        tahunMasuk352 = TahunMasuk352;
        gajiPokok352 = GajiPokok352;
        jamLembur352 = JamLembur352;
        HitungGajiAkhir(GajiPokok352, JamLembur352);
    }
    
    public void cetakSatpam()
    {
        System.out.println("\n----------DATA SATPAM-----------");
        System.out.println("NIP        : " + nip352);
        System.out.println("Nama       : " + nama352);
        System.out.println("Alamat     : " + alamat352);
        System.out.println("Gaji Pokok : " + gajiPokok352);
        System.out.println("Jam Lembur : " + jamLembur352);
        System.out.println("Gaji Akhir : " + getGajiAkhir());
        System.out.println("--------------------------------\n");
    }
}