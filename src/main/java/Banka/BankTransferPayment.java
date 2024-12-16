package Banka;
/*
* o BankTransferPayment Sınıfı: Bu alt sınıf aşağıdaki yöntemleri uygulamalıdır:

validatePayment() (boolean döndürür): Bu yöntem, banka hesap numarasının tam olarak 10 hane uzunluğunda olup olmadığını ve yalnızca rakamlardan oluşup oluşmadığını kontrol etmelidir.

processPayment() (void döndürür): Bu yöntem, ödemeyi banka havalesiyle işlemeyi simüle etmelidir.
* */
public class BankTransferPayment extends Ödeme{


    public BankTransferPayment(double amount, String currency) {
        super(amount, currency);
    }

    public boolean validatePayment(String HesapNo){
        if (!HesapNo.equals(HesapNo.replaceAll("[A-Za-z]","").trim())){
            System.out.println("Yanlış karekter girdiniz");
        }else {
            System.out.println("İsleminiz devam ediyor lütfen bekleyiniz.");
        }
        return HesapNo.length() == 10;
    }


    public void processPayment(){
        System.out.println("İşleminiz banka havalesi olarak gercekleştiriliyor lütfen bekleyiniz.");
    }

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
