/*
* Ad Soyad: [Ecenur Üner]
* Öğrenci No: [250541078]
* Tarih: 24.10.2025
* Açıklama: Görev 3 - Maaş Hesaplama Sistemi
Çözüm:
import java.util.Scanner;
      public class MaasHesap {
      public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

          //Bilgilerin Alınması
          System.out.print("Çalışanın Adı Soyadı: ");
          String adSoyad = input.nextLine();

          System.out.print("Aylık Brüt Maaş (TL): ");
          double brutMaas = input.nextDouble();

          System.out.print("Haftalık Çalışma Saati: ");
          int haftalikSaat = input.nextInt();

          System.out.print("Mesai Saati (Ay içinde toplam): ");
          int mesaiSaat = input.nextInt();

          //Gelirler
          double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
          double toplamGelir = brutMaas + mesaiUcreti;

          //Kesintiler
          double sgk = toplamGelir * 0.14;
          double gelirVergisi = toplamGelir * 0.15;
          double damgaVergisi = toplamGelir * 0.00759;
          double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

          //Net Maaş
          double netMaas = toplamGelir - toplamKesinti;

          //İstatistikler
          double kesintiOrani = (toplamKesinti / toplamGelir) *  100;
          double saatlikNetKazanc = netMaas / 176;
          double gunlukNetKazanc = netMaas / 22;

          //Çıktı
          System.out.println("====================================");
          System.out.println(" MAAŞ BORDROSU");
          System.out.println("====================================");
          System.out.println("Çalışan: " + adSoyad);

          System.out.println("GELIRLER:");
          System.out.printf("Brüt Maaş: %.2f TL%n", brutMaas);
          System.out.printf("Mesai Ücreti: %.2f TL%n", mesaiUcreti);
          System.out.println("------------------------");
          System.out.printf("Toplam Gelir: %.2f TL%n\n", toplamGelir);

          System.out.println("KESINTILER:");
          System.out.printf("SGK Kesintisi: %.2f TL%n", sgk);
          System.out.printf("Gelir Vergisi: %.2f TL%n", gelirVergisi);
          System.out.printf("Damga Vergisi: %.2f TLn", damgaVergisi);
          System.out.println("------------------------");
          System.out.printf("ToplamKesinti: %.2f TL%n", toplamKesinti);

          System.out.printf("Net Maaş = %.2f TL%n", netMaas);
          System.out.printf("Kesinti Oranı = %.2f %% %n", kesintiOrani);
          System.out.printf("Saatlik Net Kazanç: %.2f TL%n", saatlikNetKazanc);
          System.out.printf("Günlük Net Kazanç: %.2f TL%n", gunlukNetKazanc);

      }
}
