package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    static  int tipeGolongan ;
    static  int kwh=0;
    static int id []={1,2,3,4};
    static String nama[]={"Galuh","indro","Jedi","Kanu"};
    static int golongan[]={1,3,2,3};
    static String alamat[]={"Sawojajar","kedung kandang", "Ijen","Dinoyo"};

    static  void tagihan(int tipeGolongan, int kwh ){
        int index = tipeGolongan;
        int tipe1 = 1000;
        int tipe2 = 1300;
        int tipe3 = 1500;
        int hasil = 0;
        int minimalBayar =50000;
        int biayaAdmin = 13000;


        switch (tipeGolongan){
            case 1 :
                hasil = kwh * tipe1;
                if (hasil<50000){
                    System.out.print(minimalBayar+ biayaAdmin);
                }else System.out.print(hasil+ biayaAdmin);
                break;
            case 2:
                hasil = kwh * tipe2;
                if (hasil<50000){
                    System.out.print(minimalBayar+ biayaAdmin);
                }else System.out.print(hasil+ biayaAdmin);
            case 3:
                hasil = kwh * tipe3;
                if (hasil<50000){
                    System.out.print(minimalBayar+ biayaAdmin);
                }else System.out.print(hasil+ biayaAdmin);
                break;
            default:
                System.out.println("Hanya ada 3 golongan yaitu: 1, 2, 3");
        }
    }

static void Tampilan(int id_pelanggan) {
    int index = id_pelanggan - 1;
    String namaPelanggan = nama[index];
    id_pelanggan = id[index];
    String alamat_pelanggan = alamat[index];
   tipeGolongan =golongan[index];


    switch (id_pelanggan) {
        case 1, 2, 3, 4:
            System.out.println("ID : "+id_pelanggan);
            System.out.println("Nama : " + namaPelanggan);
            System.out.println("Alamat : " + alamat_pelanggan);
            System.out.println("Golongan :" + tipeGolongan);
            System.out.println("Tagihan Bulan ini: ");
            tagihan(tipeGolongan, kwh);
            break;


    }

}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan ID: ");
    int id_pelanggan = input.nextInt();
    System.out.println("Masukan KWH: ");
    kwh = input.nextInt();


    Tampilan(id_pelanggan);
    }
}
