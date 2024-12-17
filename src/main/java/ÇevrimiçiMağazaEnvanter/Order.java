package ÇevrimiçiMağazaEnvanter;
//1.Genel Sistem Özellikleri:
    //- Kullanıcılar sepetlerini inceleyip sipariş verebilir.
    //  Sipariş durumu takip edilebilir (örneğin, hazırlanıyor, kargoda, teslim edildi).

//2. Teknik Yaklaşım
    //  - Sipariş bilgilerini saklar (kullanıcı, ürünler, sipariş tarihi, durum).
    //  - Siparişin durumunu günceller.

//3.Veri Yapıları ve Map Kullanımı:
    //Map<Integer, Order>: Sipariş kimliği (ID) -> Sipariş nesnesi.

//4.Çalışma Süreci:
    //Sipariş Verme:
    //- Kullanıcı sepeti onaylar, sipariş verir ve ödeme işlemi yapılır (entegre sistemler: kredi kartı, PayPal, vb.).

//5. Ek Özellikler:

public class Order {
}
