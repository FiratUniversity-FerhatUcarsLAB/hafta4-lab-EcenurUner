/*
* Ad Soyad: [Ecenur Üner]
* Ogrenci No: [250541078]
* Tarih: [24.10.2025]
* Aciklama: Görev 2 - Geometrik Hesaplayıcı
  Çözüm:
import java.util.Scanner;
public class GeometrikHesap {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Yarıçap Bilgisi Al
        System.out.print("Daire yaricapini giriniz: ");
        double yaricap = input.nextDouble();

        //Pi sayısı tanmlama
        float pi = 3.14159f;


        //Matematiksel İşlemler
        System.out.println("SONUCLARI GOSTER");
        System.out.println("-------------");

        //Daire Alanı
        double alan = pi * Math.pow(yaricap, 2);
        System.out.printf("Daire Alani: %.2f cm\n", alan);

        //Daire Cevresi
        double cevre = 2 * pi * yaricap;
        System.out.printf("Daire cevre: %.2f cm\n", cevre);

        //Daire Çapı
        double cap = 2 * yaricap;
        System.out.printf("Daire Capi: %.2f cm\n", cap);

        //Küre Hacmi
        double kure_hacmi = (4.0 / 3.0) * pi * Math.pow(yaricap, 3);
        System.out.printf("Kure Hacmi= %.2f cm\n", kure_hacmi);

        double kure_yuzey_alani = 4 * pi * Math.pow(yaricap, 2);
        System.out.printf("/n Kure Yuzey Alani: %.2f cm^2 , kure_yuzey_alani");

    }
}
