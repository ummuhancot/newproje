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


    private double Amount;
    private String currency;


    public Ödeme(double amount, String currency) {
        Amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }



    public abstract void processPayment();

    public abstract boolean validatePayment(int Odeme);

    public void displayDetails(){

        System.out.println("Ödeme tutarı : " + Amount);
        System.out.println("Para birimi : " + currency);

    }
}
