package com.mrsyafapri.utspl;

public class Mahasiswa {
    String nama;
    String nim;
    String pilihan;
    double nilaiAkhir;
    String nilaiHuruf;
    String keterangan;

    void mataKuliah(int pilihan) {
        switch (pilihan) {
            case 1:
                this.pilihan = "Pemrograman Fundamental";
                break;
            case 2:
                this.pilihan = "Pemrograman Lanjutan";
                break;
            case 3:
                this.pilihan = "Pemrograman Mobile";
                break;
            default:
                break;
        }
    }

    String nilaiHuruf(double nilai) {
        String nilaiHuruf;
        if (nilai >= 85 && nilai <= 100) {
            nilaiHuruf = "A";
        } else if (nilai >= 81 && nilai < 85) {
            nilaiHuruf = "A-";
        } else if (nilai >= 75 && nilai < 81) {
            nilaiHuruf = "B+";
        } else if (nilai >= 70 && nilai < 75) {
            nilaiHuruf = "B";
        } else if (nilai >= 65 && nilai < 70) {
            nilaiHuruf = "B-";
        } else if (nilai >= 60 && nilai < 65) {
            nilaiHuruf = "C+";
        } else if (nilai >= 55 && nilai < 60) {
            nilaiHuruf = "C";
        } else if (nilai >= 50 && nilai < 55) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        return nilaiHuruf;
    }

    String kelulusan(double nilai) {
        // String kelulusan;
        if (nilai > 55) {
            return "Lulus";
        } else {
            return "Gagal";
        }
        // return kelulusan;
    }

    void cetak() {
        System.out.println("Nama mahasiswa  :" + this.nama);
        System.out.println("NIM             :" + this.nim);
        System.out.println("Nama mata kuliah:" + this.pilihan);
        System.out.println("Nilai akhir     :" + this.nilaiAkhir);
        System.out.println("Nilai Huruf     :" + this.nilaiHuruf);
        System.out.println("Keterangan      :" + this.keterangan);
    }
}
