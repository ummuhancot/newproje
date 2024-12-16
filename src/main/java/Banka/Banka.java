package Banka;

import java.util.Scanner;

public class Banka {

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
2. Alt sınıflar:

İki alt sınıf oluşturun: CreditCardPayment ve BankTransferPayment.
Bu sınıflar Ödeme sınıfını genişletmelidir. o CreditCardPayment Sınıfı: Bu alt sınıf aşağıdaki yöntemleri uygulamalıdır:

validatePayment() (boolean döndürür): Bu yöntem, kart numarasının tam olarak 16 hane uzunluğunda olup olmadığını ve yalnızca rakamlardan oluşup oluşmadığını kontrol etmelidir.

processPayment() (void döndürür): Bu yöntem, ödemeyi kredi kartı kullanarak işlemeyi simüle etmelidir.
o BankTransferPayment Sınıfı: Bu alt sınıf aşağıdaki yöntemleri uygulamalıdır:

validatePayment() (boolean döndürür): Bu yöntem, banka hesap numarasının tam olarak 10 hane uzunluğunda olup olmadığını ve yalnızca rakamlardan oluşup oluşmadığını kontrol etmelidir.

processPayment() (void döndürür): Bu yöntem, ödemeyi banka havalesiyle işlemeyi simüle etmelidir.
     */
public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        start();

    }

    private static void start() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter payment type (CreditCard, BankTransfer, or 'exit' to quit): ");
            String paymentType = scanner.nextLine();

            if (paymentType.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter the payment amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Enter the currency: ");
            String currency = scanner.nextLine();

            Ödeme payment = null;

            switch (paymentType.toLowerCase()) {
                case "creditcard":
                    System.out.println("Enter your 16-digit credit card number: ");
                    String cardNumber = scanner.nextLine();

                    payment = new CreditCardPayment(amount, currency, cardNumber);

                    if (payment.validatePayment()) {
                        payment.displayDetails();
                        payment.processPayment();
                    } else {
                        System.out.println("Invalid Credit Card Number. Please try again.");
                    }
                    break;

                case "banktransfer":
                    System.out.println("Enter your 10-digit bank account number: ");
                    String bankAccountNumber = scanner.nextLine();

                    payment = new BankTransferPayment(amount, currency, bankAccountNumber);

                    if (payment.validatePayment()) {
                        payment.displayDetails();
                        payment.processPayment();
                    } else {
                        System.out.println("Invalid Bank Account Number. Please try again.");
                    }
                    break;

                default:
                    System.out.println("Invalid payment type. Please try again.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
        System.out.println("Program terminated.");
    }

}
