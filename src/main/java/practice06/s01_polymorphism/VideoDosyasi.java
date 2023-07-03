package practice06.s01_polymorphism;

public class VideoDosyasi extends Medya{
    public VideoDosyasi(String dosyaAdi) {
        super(dosyaAdi);
    }

    @Override
    public void oynat() {
        System.out.println("video dosyası oynatılıyor");
    }

    @Override
    public void durdur() {
        System.out.println("Video dosyasi durduruluyor");
    }
}
