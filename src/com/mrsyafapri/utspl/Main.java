package com.mrsyafapri.utspl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa stefani = new Mahasiswa();

        System.out.print("Nama :");
        String a = input.nextLine();
        stefani.nama = a;

        System.out.print("NIM :");
        String nim = input.nextLine();
        stefani.nim = nim;

        System.out.print("Pilihan(1-4) :");
        int pilihan = input.nextInt();
        stefani.mataKuliah(pilihan);

        System.out.print("Nilai Akhir :");
        double nilaiAkhir = input.nextDouble();
        stefani.nilaiAkhir = nilaiAkhir;

        stefani.nilaiHuruf = stefani.nilaiHuruf(stefani.nilaiAkhir);
        stefani.keterangan = stefani.kelulusan(stefani.nilaiAkhir);
        stefani.cetak();

        input.close();
    }
}
