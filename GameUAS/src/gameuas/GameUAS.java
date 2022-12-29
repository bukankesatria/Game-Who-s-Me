/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gameuas;

import java.util.*;
import java.lang.Math;

public class GameUAS {

    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int nyawa, counter, mulai, poin, nomor;
        String tebakkata;
        boolean menang, ketemu;

        String[] soal = new String[10], jawab = new String[10];

        soal[0] = "Saya harus memiliki keterampilan mengolah tubuh agar melahirkan gerakan-gerakan indah";
        soal[1] = "Saya bekerja menggunakan palu, dalam bekerja saya harus memutuskan masalah dengan adil";
        soal[2] = "Tugas saya sering berada didepan kelas, tempat kerja saya di perguruan tinggi";
        soal[3] = "Saya biasa berkelana dari satu tempat ke tempat yang lain, Saya mengendarai sebuah alat transportasi jalur udara.";
        soal[4] = "Pekerjaan saya sangat penting bagi negara. Saya menjaga negara dari ancaman dan serangan musuh, Saya ahli dalam senjata.";
        soal[5] = "Saya bekerja di bidang kesehatan yang berfokus pada kesehatan ibu dan anak. Saya biasa membantu ibu yang akan melahirkan.";
        soal[6] = "Pekerjaan saya di bidang rancang bangun, saya pandai merancang bangunan seperti rumah yang memiliki desain yang estetik";
        soal[7] = "Tugas saya adalah memasak di Restoran, membuat kreasi masakan, memilih bahan-bahan yang akan di masak sehingga menghasilkan masakan dengan standar tinggi.";
        soal[8] = "Untuk memperoleh pekerjaan ini saya harus lulus sarjana farmasi, pekerjaan utama saya adalah memberikan obat sesuai resep dokter.";
        soal[9] = "Saya bekerja mengarahkan banyak orang, pekerjaan saya juga berhubungan dengan penulis scenario, hasil kerja saya bisa dinikmati di televisi atau bioskop.";
        jawab[0] = "penari";
        jawab[1] = "hakim";
        jawab[2] = "dosen";
        jawab[3] = "pilot";
        jawab[4] = "tentara";
        jawab[5] = "bidan";
        jawab[6] = "arsitek";
        jawab[7] = "chef";
        jawab[8] = "apoteker";
        jawab[9] = "sutradara";

        System.out.println("=========================");
        System.out.println("|| ???   WHO'S ME  ??? ||");
        System.out.println("=========================");
        poin = 0;

        do {
            System.out.println("\n" + "========================================");
            System.out.println(" Selamat Datang diGame Tebak Siapa Saya ");
            System.out.println("========================================");
            System.out.println("Silahkan Pilih Menu dibawah Ini");
            System.out.println("1. Mulai Permainan");
            System.out.println("2. Prosedur Permainan");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu : ");
            mulai = input.nextInt();

            while (mulai == 1) {
                nomor = random.nextInt(9);
                String[] listjawab = new String[jawab[nomor].length()];

                nyawa = 5;
                menang = false;
                while (nyawa > 0 && menang == false) {
                    System.out.println("\n" + "CLUE");
                    System.out.println(soal[nomor]);
                    for (counter = 0; counter <= jawab[nomor].length() - 1; counter++) {
                        listjawab[counter] = " _ ";
                        System.out.print(listjawab[counter]);
                    }
                    System.out.println("\n");
                    tebakkata = input.next();
                    ketemu = false;

                    if (ketemu == false) {
                        nyawa = nyawa - 1;
                    }

                    if (tebakkata.equals(jawab[nomor])) {
                        System.out.println("Anda Menebak Saya dengan Benar. Selamat, anda menang!");
                        menang = true;
                        poin = poin + 100;
                    } else {
                        System.out.println("Salah!");
                        System.out.println(" ");
                        System.out.println("Kamu mempunyai " + nyawa + " nyawa tersisa");
                    }
                }
                System.out.println("Poin Anda Sekarang " + poin);
                System.out.println("\n" + "Ulangi Lagi ?");
                System.out.println("Pilih 1 Jika YA / Pilih 3 Jika TIDAK");
                mulai = input.nextInt();
                break;
            }

            while (mulai == 2) {
                System.out.println("\n" + "Aturan dari permainan ini sangat sederhana" + "\n" + "anda hanya perlu menebak "
                        + "profesi apa yang berhubungan" + "\n" + "dengan clue yang akan kami berikan, anda diberikan "
                        + "5 nyawa" + "\n" + "atau 5 kesempatan untuk menebak profesi tersebut," + "\n" + "jika anda salah dalam 5 "
                        + "kali kesempatan maka poin anda tidak bertambah" + "\n" + "dan anda akan diarahkan lagi untuk "
                        + "mengulang game atau tidak.");
                System.out.println("\n" + "Ingin Memulai Game?");
                System.out.println("Pilih 1 Jika anda ingin memulai");
                mulai = input.nextInt();
            }

        } while (mulai != 3);
        {
            System.out.println("Anda Keluar dari Game");

        }
        System.out.println("Skor Akhir Anda : " + poin);
    }

}
