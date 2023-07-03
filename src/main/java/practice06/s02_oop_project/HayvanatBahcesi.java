package practice06.s02_oop_project;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi {

private static List<Hayvan> hayvanlar=new ArrayList<>();
private List<Ziyaretci>ziyaretciler=new ArrayList<>();

    public static void hayvanEkle(Hayvan hayvan){
        hayvanlar.add(hayvan);
    }

    public void ziyaretciEkle(Ziyaretci ziyaretci){
        ziyaretciler.add(ziyaretci);
    }


public  void hayvanListele(){
    System.out.println("HAYVANLAR LİSTESİ.");
    System.out.println("_____________________");

    for(Hayvan hayvan:hayvanlar){
        System.out.println("Ad: "+ hayvan.getAd());
        System.out.println("Yas: "+ hayvan.getYas());
        System.out.println("Tür: "+ hayvan.getTur());
        System.out.println("_____________________");
    }
    }

public void hayvanTablola(){
    System.out.println("HAYVANLAR LİSTESİ");
    System.out.println("___________________");
    System.out.printf("%-10s %-4s %-10s %n", "Ad", "Yaş", "Tür");
    System.out.println("______________________________________");

    for (Hayvan hayvan:hayvanlar){
        System.out.printf("%-10s %-4s %-10s %n", hayvan.getAd(), hayvan.getYas(),hayvan.getTur());

        System.out.println("________________________________");
    }
}


}
