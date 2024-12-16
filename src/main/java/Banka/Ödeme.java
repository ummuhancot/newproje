package Banka;

import java.util.Scanner;

/*
 1. Soyut Sınıf:

Ödeme adında soyut bir sınıf oluşturun.

Bu sınıfın aşağıdaki alanları olmalıdır:
o amount (type: double): Ödenecek tutar.
o currency (type: String): Ödemenin para birimi.

Ödeme sınıfı aşağıdaki soyut yöntemleri içermelidir:
o abstract void processPayment(); Bu yöntem ödeme işlemini gerçekleştirmelidir. Belirli uygulama alt sınıflarda olacaktır.
o abstract boolean validatePayment(); Bu yöntem ödeme ayrıntılarını doğrulamalıdır. Belirli doğrulama mantığı alt sınıflarda olacaktır.

Ek olarak, somut bir yöntem ekleyin:
o void displayDetails(); Bu yöntem kullanıcıya ödeme tutarını ve para birimini göstermelidir.
 */
public abstract class Ödeme {


    double amount;
    String currency;


    public Ödeme(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }



    public abstract void processPayment();
    public abstract boolean validatePayment();


    public void displayDetails() {
        System.out.println("Payment Details:");
        System.out.println("Amount: " + amount + " " + currency);
    }
}
