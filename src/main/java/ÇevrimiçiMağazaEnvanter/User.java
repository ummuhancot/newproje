package ÇevrimiçiMağazaEnvanter;

//1.Genel Sistem Özellikleri:
//    Müşteri hesapları oluşturulabilir, düzenlenebilir ve silinebilir.
//    Kullanıcı girişi gereklidir (isteğe bağlı: sosyal medya veya e-posta ile giriş).

//2. Teknik Yaklaşım
//    Kullanıcı bilgilerini (ad, e-posta, şifre, adres, vb.) saklar.
//    Kullanıcı rolleri (müşteri, admin) için özellikler eklenir.

//3.Veri Yapıları ve Map Kullanımı:
//Map<String, User>: E-posta -> Kullanıcı nesnesi.

//4.Çalışma Süreci:
//- Kullanıcı, giriş yaptıktan sonra ürünlere göz atabilir.

//5. Ek Özellikler:

public class User {

    private  String name;
    private  String lastname;
    private  String email;
    private  String password;


}
