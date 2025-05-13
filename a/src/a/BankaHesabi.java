package a;
public class BankaHesabi {
    private String hesapSahibi;
    private String hesapNumarasi;
    private double bakiye;

    // Hesap oluşturulurken sahip ve hesap numarası girilir.
    public BankaHesabi(String hesapSahibi, String hesapNumarasi) {
        this.hesapSahibi = hesapSahibi;
        this.hesapNumarasi = hesapNumarasi;
        this.bakiye = 0.0;  // Başlangıçta bakiye sıfır.
    }

    // Para yatırma işlemi
    public void paraYatir(double miktar) {
        if (miktar > 0) {
            bakiye += miktar;
            System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye);
        } else {
            System.out.println("Geçersiz miktar. Lütfen pozitif bir değer girin.");
        }
    }

    // Para çekme işlemi
    public void paraCek(double miktar) {
        if (miktar > 0 && miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Kalan bakiye: " + bakiye);
        } else {
            System.out.println("Yetersiz bakiye veya geçersiz miktar.");
        }
    }

    // Bakiye görüntüleme işlemi
    public void bakiyeGoster() {
        System.out.println("Güncel bakiye: " + bakiye + " TL");
    }

    // Hesap bilgileri görüntüleme
    public void hesapBilgileriGoster() {
        System.out.println("Hesap Sahibi: " + hesapSahibi);
        System.out.println("Hesap Numarası: " + hesapNumarasi);
        System.out.println("Bakiye: " + bakiye + " TL");
    }
}