package utsA11202113793;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        int pilihan;
        System.out.print("Jumlah Mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();

        while (true) {
            System.out.println("Pilihan : ");
            System.out.println("1. Mahasiswa Aktif");
            System.out.println("2. Mahasiswa Baru/Transfer");
            System.out.println("3. Mahasiswa Lulus");
            System.out.print("Pilih : ");
            pilihan = input.nextInt();
            if (pilihan == 2) {
                System.out.println("Pilih Salah Satu!");
                System.out.println("1. Mahasiswa Baru");
                System.out.println("2. Mahasiswa Transfer");
                pilihan = input.nextInt();
                if (pilihan == 1) {
                    pilihan = 2;
                } else if (pilihan == 2) {
                    pilihan = 4;
                }
            }
            switch (pilihan) {
                case 1:
                    for (int i = 0; i < jumlahMahasiswa; i++) {
                        Mahasiswa mahasiswa = new Mahasiswa();
                        System.out.println("Data Mahasiswa " + (i + 1) + " :");
                        System.out.print("Nama : ");
                        mahasiswa.nama = input.next();
                        System.out.print("NIM : ");
                        mahasiswa.nim = input.next();
                        System.out.print("Semester : ");
                        mahasiswa.semester = input.nextInt();
                        System.out.println("Usia : ");
                        mahasiswa.usia = input.nextInt();
                        mahasiswa.inputKRS();
                        mahasiswa.hitungRataNilai();
                        daftarMahasiswa.add(mahasiswa);
                    }
                    break;
                case 2:
                    for (int i = 0; i < jumlahMahasiswa; i++) {
                        MahasiswaBaru MB = new MahasiswaBaru();
                        System.out.println("Data Mahasiswa " + (i + 1) + " :");
                        System.out.print("Nama : ");
                        MB.nama = input.next();
                        System.out.print("NIM : ");
                        MB.nim = input.next();
                        System.out.print("Semester : ");
                        MB.semester = input.nextInt();
                        System.out.print("Usia : ");
                        MB.usia = input.nextInt();
                        System.out.println("Asal Sekolah : ");
                        MB.asalSekolah = input.next();
                        MB.inputKRS();
                        MB.hitungRataNilai();
                        daftarMahasiswa.add(MB);
                    }
                    break;
                case 3:
                    for (int i = 0; i < jumlahMahasiswa; i++) {
                        MahasiswaLulus ML = new MahasiswaLulus();
                        System.out.println("Data mahasiswa " + (i + 1) + " :");
                        System.out.print("Nama : ");
                        ML.nama = input.next();
                        System.out.print("NIM : ");
                        ML.nim = input.next();
                        System.out.print("Semester : ");
                        ML.semester = input.nextInt();
                        System.out.print("Usia : ");
                        ML.usia = input.nextInt();
                        System.out.println("Tahun Masuk : ");
                        ML.tahunMasuk = input.nextInt();
                        ML.inputKRS();
                        ML.hitungRataNilai();
                        daftarMahasiswa.add(ML);
                    }
                    break;
                case 4:
                    for (int i = 0; i < jumlahMahasiswa; i++) {
                        MahasiswaTransfer MT = new MahasiswaTransfer();
                        System.out.println("Data mahasiswa " + (i + 1) + " :");
                        System.out.print("Nama : ");
                        MT.nama = input.next();
                        System.out.print("NIM : ");
                        MT.nim = input.next();
                        System.out.print("Semester : ");
                        MT.semester = input.nextInt();
                        System.out.print("Usia : ");
                        MT.usia = input.nextInt();
                        System.out.println("Asal Universitas : ");
                        MT.asalUniversitas = input.next();
                        MT.inputKRS();
                        MT.hitungRataNilai();
                        daftarMahasiswa.add(MT);
                    }
                    break;
            }
            // display
            for (int i = 0; i < daftarMahasiswa.size(); i++) {
                System.out.println("\nData mahasiswa " + (i + 1) + " :");
                daftarMahasiswa.get(i).infoMahasiswa();
                daftarMahasiswa.get(i).infoKrsMahasiswa();
            }
            break;
        }
        input.close();
    }

}
