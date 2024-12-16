package employ;

import java.util.Scanner;

public class Department extends Eployees{
String DepartmentAdı;

    public Department(String ad, String soyad, double maas, String departmentAdı) {
        super(ad, soyad, maas);
        this.DepartmentAdı = departmentAdı;
    }



}
