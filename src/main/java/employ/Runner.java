package employ;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Eployees> list =new ArrayList<>();
    public static void main(String[] args) {


        //start();
        start1();



    }

    private static void start1() {

        int select;
        do {




            select = input.nextInt();
            switch (select){
                case 1:
                //Kullanıcı girişine göre adı, soyadı, maaşı ve departman adını atayın


                    break;
                case 2:
                //Hem departman hem de çalışan bilgilerini görüntülemek için bir yöntem yazın (çalışan ayrıntıları için Görüntüleme yöntemini çağırın)
                    break;
                case 0:
                    break;
                default:
                    System.out.println("hatalı giriş ...");
                    break;
            }
        }while (select!=0);


    }


    private static void start() {
        for(int i=1;i<=4;i++) {
            System.out.println("isim girin");
            String name = input.nextLine();
            System.out.println("soyisim girin");
            String soyisim = input.nextLine();
            System.out.println("maas girin");
            double maas = input.nextDouble();
            input.nextLine();
            System.out.println("departman adı girin");
            String departmanAdı = input.nextLine();
            System.out.println("maas yüzdesi girin");
            double yuzde = input.nextDouble();
            input.nextLine();
            maas = maas+ maas*(yuzde/100);
            Eployees eployees = new Department(name, soyisim, maas, departmanAdı);
            list.add(eployees);
        }
        for(Eployees w:list){
            System.out.println(w);
        }

    }


}
