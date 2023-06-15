package practice03;

public class S02_PassByValue_ArrayDuzenleme {

 /*
        İçinde verilmiş bir sayının orijinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            int sayi = 42;
            - Sayıyı karesini alın.
            - Sayıyı küpünü alın.
            - Sayının karekökünü alın.
            - Sayının mutlak değerini alın.
            - Sayıyı 10 ile çarpın ve sonucu yazdırın.
    */

    public static void main(String[] args) {
        int sayi = 42;

        System.out.println(sayi);
        System.out.println(karesiniAl(sayi));
        sayi = karesiniAl(sayi);
        System.out.println(sayi);
        System.out.println(kupuAl(sayi));
        System.out.println(karekokAl(sayi));
        System.out.println(mutlakAl(sayi));
        caprma(sayi);
    }

    public static int karesiniAl(int deger){
        deger = (int) Math.pow(deger, 2);
        return deger;
    }

    public static int kupuAl(int deger){
        deger=(int)Math.pow(deger,3);
        //System.out.println(deger);
        return deger;
    }

    public static int karekokAl(int deger){
        deger=(int)Math.sqrt(deger);
        return deger;
    }
    public static int mutlakAl(int deger){
        deger=Math.abs(deger);
        return deger;
    }
    public static void caprma(int deger){
        deger=deger*10;
        System.out.println(deger);

    }
}
