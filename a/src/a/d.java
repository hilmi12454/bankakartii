package a;
import java.util.Scanner;
public class d {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Kullanıcıdan hesap bilgilerini alalım.
	        System.out.print("Hesap Sahibini girin: ");
	        String hesapSahibi = scanner.nextLine();

	        System.out.print("Hesap Numarasını girin: ");
	        String hesapNumarasi = scanner.nextLine();

	        // Banka hesabını oluşturuyoruz
	        BankaHesabi hesap = new BankaHesabi(hesapSahibi, hesapNumarasi);

	        // Menü ve işlem seçimleri
	        int secim = 0;
	        do {
	            System.out.println("\n--- BANKA MENÜSÜ ---");
	            System.out.println("1. Para Yatır");
	            System.out.println("2. Para Çek");
	            System.out.println("3. Bakiye Görüntüle");
	            System.out.println("4. Hesap Bilgilerini Görüntüle");
	            System.out.println("5. Çıkış");
	            System.out.print("Seçiminizi yapın (1-5): ");
	            secim = scanner.nextInt();

	            switch (secim) {
	                case 1:
	                    System.out.print("Yatırmak istediğiniz miktarı girin: ");
	                    double yatirilanMiktar = scanner.nextDouble();
	                    hesap.paraYatir(yatirilanMiktar);
	                    break;
	                case 2:
	                    System.out.print("Çekmek istediğiniz miktarı girin: ");
	                    double cekilenMiktar = scanner.nextDouble();
	                    hesap.paraCek(cekilenMiktar);
	                    break;
	                case 3:
	                    hesap.bakiyeGoster();
	                    break;
	                case 4:
	                    hesap.hesapBilgileriGoster();
	                    break;
	                case 5:
	                    System.out.println("Çıkış yapılıyor...");
	                    break;
	                default:
	                    System.out.println("Geçersiz seçenek, lütfen 1-5 arası bir değer girin.");
	                    break;
	            }
	        } while (secim != 5);  // Kullanıcı çıkış yapana kadar devam eder.

	        scanner.close();
	    }
	}

