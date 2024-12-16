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




}
