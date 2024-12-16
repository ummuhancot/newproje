package Banka;

import java.util.Scanner;

import static java.util.Collections.replaceAll;

/**
Bu sınıflar Ödeme sınıfını genişletmelidir. o CreditCardPayment Sınıfı: Bu alt sınıf aşağıdaki yöntemleri uygulamalıdır:

validatePayment() (boolean döndürür): Bu yöntem, kart numarasının tam olarak 16 hane uzunluğunda olup olmadığını ve yalnızca rakamlardan oluşup oluşmadığını kontrol etmelidir.

processPayment() (void döndürür): Bu yöntem, ödemeyi kredi kartı kullanarak işlemeyi simüle etmelidir.
*/

public class CreditCardPayment extends Ödeme{

    public CreditCardPayment(double amount, String currency) {
        super(amount, currency);
    }

    public boolean validatePayment(String CartNo) {

        if (!CartNo.equals(CartNo.replaceAll("[A-Za-z]","").trim())){
            System.out.println("Yanlış karekter girdiniz");
        }else {
            System.out.println("İsleminiz devam ediyor lütfen bekleyiniz.");
        }
        return CartNo.length() == 16;
    }

    public void processPayment(){

        System.out.println("Ödemeye kredi kartı ile devame edilecek");


    }
/*
o abstract boolean validatePayment(); Bu yöntem ödeme ayrıntılarını doğrulamalıdır. Belirli doğrulama mantığı alt sınıflarda olacaktır.
*/

    @Override
    public boolean validatePayment(int OdemeTutari) {

       try {
           if (OdemeTutari <= 0) {
               System.out.println("Geçersiz ödeme tutarı!");
           }

       }catch (Exception e){
           throw new RuntimeException(e);
       }
        return false;
    }



}
