package com.mrsyafapri.utspl;

public class App {
    public static void main(String[] args) {
        Mahasiswa stefani = new Mahasiswa();
        stefani.nama = "Stefani Atmajaya";
        stefani.nim = "1089726351810";
        stefani.mataKuliah(2);
        stefani.nilaiAkhir = 83.5;
        stefani.nilaiHuruf = stefani.nilaiHuruf(stefani.nilaiAkhir);
        stefani.keterangan = stefani.kelulusan(stefani.nilaiAkhir);
        stefani.cetak();
    }
}
