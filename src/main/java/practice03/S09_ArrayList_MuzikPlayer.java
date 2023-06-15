package practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class S09_ArrayList_MuzikPlayer {

/*
        Bir müzik çalma listesi uygulaması geliştiriyorsunuz.
        Kullanıcılar, çalma listelerine şarkı ekleyebilmeli, şarkıları sıralayabilmeli ve
        şarkıları listeden silebilmelidir.
        Ayrıca, kullanıcılara çalma listesini tamamen sıfırlama seçeneği de sunmanız isteniyor.
    */

    static Scanner input = new Scanner(System.in);
    static List<String> sarkiListesi = new ArrayList<>();

    public static void main(String[] args) {
        do {
            System.out.println("1-)Sarki ekleme\n"+"2-)Sarkilari sirala\n"+"3-)Sarki silme\n"+"4-)Liste silme\n"+"5-)Cikis");

            int islem = alInputNumber();
            switch (islem) {

                case 1:
                    ekleme();
                    break;
                case 2:
                    siralma();
                    break;
                case 3:
                    silme();
                    break;
                case 4:
                    tamamenSilme();
                    break;
                case 5:
                    cikis();
                    break;
                default:
                    System.out.println("Gecerli bir rakam tuslayın");
            }

        }while (true);

    }
    public static int alInputNumber() {
        int inputNumber=0;
        boolean dogrulama = true;
        do {
            String girdi = input.nextLine();
            if (girdi.matches("\\d+")) {
                inputNumber = Integer.parseInt(girdi);
                dogrulama = false;
            } else {
                System.out.println("Rakam tuslayin");
            }
        } while (dogrulama);
        return inputNumber;
    }

    private static boolean devamKontrol() {
        char yN;
        do {
            System.out.println("Baska islem yapmak istiyormusunuz Y/N");
            yN = input.next().toUpperCase().charAt(0);
            input.nextLine();
            if (yN != 'Y' && yN != 'N') {
                System.out.println("Y veya N ye basiniz hatali tuslama yaptiniz");
            }
        } while (yN != 'Y' && yN != 'N');
        return yN == 'Y';
    }



    public static void ekleme(){
        do {
            System.out.println("Eklemek istediginiz sarki ismini giriniz");
            String parca = input.nextLine().toUpperCase();
            if (sarkiListesi.contains(parca)) {
                System.out.println("Sarki listede mevcut");
            } else {
                sarkiListesi.add(parca);
                System.out.println("Sarki eklendi");
            }
        }while (devamKontrol());
    }

    public static void siralma(){
        do {
            System.out.println("Listedeki sıralamasını degistirmek istediginiz parcanin adi");
            String parca = input.nextLine().toUpperCase();
            if (sarkiListesi.contains(parca)) {
                System.out.println("Sarkiyi kacinci siraya koymak istersiniz");
                int yeniSira = alInputNumber();
                int sira = sarkiListesi.indexOf(parca);
                Collections.swap(sarkiListesi,sira,(yeniSira-1));
                System.out.println("Islem tamam\n"+sarkiListesi);
            }else {
                System.out.println("Girdiginiz sarki listede mevcut degil");
            }
        }while (devamKontrol());
    }
    public static void silme(){
        do {
            System.out.println("Silmek istediginiz sarki adini giriniz");
            String parca = input.nextLine().toUpperCase();
            if (sarkiListesi.contains(parca)){
                sarkiListesi.remove(parca);
                System.out.println("Islem tamam\n"+sarkiListesi);
            }else {
                System.out.println("Silmek istediginiz sarki lisetede mevcut degil");
            }
        }while (devamKontrol());
    }
    public static void tamamenSilme() {
        char yN;
        System.out.println("Sarkilarin hepsini listeden silmek istediginize eminmisiniz? Y/N");
        yN = input.next().toUpperCase().charAt(0);
        input.nextLine();
        if (yN=='Y'){
            sarkiListesi.clear();
            System.out.println("Liste silindi");
        }

    }
    public static void cikis(){
        System.exit(0);
    }

}
