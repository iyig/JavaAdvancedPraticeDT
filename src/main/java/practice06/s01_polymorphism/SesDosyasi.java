package practice06.s01_polymorphism;

public class SesDosyasi extends Medya{
    public SesDosyasi(String dosyaAdi) {
        super(dosyaAdi);
    }

    @Override
    public void oynat() {
        System.out.println("ses dosyasiı oynatiliyor");
    }

    @Override
    public void durdur() {
        System.out.println("Ses dosyasi durduruluyor");
    }
}
