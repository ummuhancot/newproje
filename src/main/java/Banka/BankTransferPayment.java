package Banka;

import java.util.Scanner;

/*
* o BankTransferPayment Sınıfı: Bu alt sınıf aşağıdaki yöntemleri uygulamalıdır:

validatePayment() (boolean döndürür): Bu yöntem, banka hesap numarasının tam olarak 10 hane uzunluğunda olup olmadığını ve yalnızca rakamlardan oluşup oluşmadığını kontrol etmelidir.

processPayment() (void döndürür): Bu yöntem, ödemeyi banka havalesiyle işlemeyi simüle etmelidir.
* */
public class BankTransferPayment extends Ödeme{

        String bankAccountNumber;

        public BankTransferPayment(double amount, String currency, String bankAccountNumber) {
            super(amount, currency);
            this.bankAccountNumber = bankAccountNumber;
        }

        @Override
        public boolean validatePayment() {

            return bankAccountNumber.matches("\\d{10}");
        }

        @Override
        public void processPayment() {
            System.out.println("Processing payment through Bank Transfer...");
            System.out.println("Bank Transfer Payment Successful!");
        }





}
