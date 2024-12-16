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

    String cardNumber;

    public CreditCardPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean validatePayment() {

        return cardNumber.length() == 16;
    }


    @Override
    public void processPayment () {
        System.out.println("Processing payment through Credit Card...");
        System.out.println("Credit Card Payment Successful!");
    }
}



