package ÇevrimiçiMağazaEnvanter;

public class Product {
//1.Genel Sistem Özellikleri:
    //- Ürünlerin listelenmesi, kategorilere ayrılması ve aranabilir olması sağlanır.
    // -Ürün bilgileri: ad, fiyat, stok durumu, açıklama ve görseller.

//2. Teknik Yaklaşım
    //Ürün bilgilerini yönetir (ID, isim, kategori, fiyat, stok).
    //Stok kontrolü sağlar (ürün eklendiğinde veya çıkarıldığında güncelleme).

//3.Veri Yapıları ve Map Kullanımı:
    //- Map<Integer, Product>: Ürün kimliği (ID) -> Ürün nesnesi.

//4.Çalışma Süreci:
    // Ürün Arama ve Filtreleme:
    // Kullanıcı, ürünleri kategori, fiyat aralığı ve anahtar kelime ile filtreleyebilir.

//5. Ek Özellikler:



    private Integer ürünId;
    private String ürünIsmi;
    private String kategori;
    private Double fiyat;
    private Integer stok;

    public Product() {
    }

    public Product(Integer ürünId, String ürünIsmi, String kategori, Double fiyat, Integer stok) {
        this.ürünId = ürünId;
        this.ürünIsmi = ürünIsmi;
        this.kategori = kategori;
        this.fiyat = fiyat;
        this.stok = stok;
    }

    public Integer getÜrünId() {
        return ürünId;
    }

    public void setÜrünId(Integer ürünId) {
        this.ürünId = ürünId;
    }

    public String getÜrünIsmi() {
        return ürünIsmi;
    }

    public void setÜrünIsmi(String ürünIsmi) {
        this.ürünIsmi = ürünIsmi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ürünId=" + ürünId +
                ", ürünIsmi='" + ürünIsmi + '\'' +
                ", kategori='" + kategori + '\'' +
                ", fiyat=" + fiyat +
                ", stok=" + stok +
                '}';
    }
}
