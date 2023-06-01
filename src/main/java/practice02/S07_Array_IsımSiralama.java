package practice02;

import java.util.Arrays;

public class S07_Array_IsımSiralama {
/*
        Bir sınıfta bulunan öğrencilerin isimlerini içeren bir array verildiğinde,
        bu öğrencilerin isimlerini sıralayan bir program yazın.
        {"Ali", "Zeynep", "Mehmet", "Ayşe"}
    */

    public static void main(String[] args) {
        String[]arr={"Ali","Zeynep","Mehmet","Ayşe"};
        Arrays.sort(arr);
        System.out.println("Sıralanmış ögrenci Listesi:" + Arrays.toString(arr));
    }

}
