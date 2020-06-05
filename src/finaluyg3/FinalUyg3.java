
package finaluyg3;

public class FinalUyg3 {

    public static void main(String[] args) 
    {
        int kirmizi=0, mavi=0;
        
        System.out.println("1. Tur başlıyor, bu turda her soru 5 puan");
        kirmizi=kirmizi+15;
        mavi=mavi+10;
        System.out.println("1. Tur bitti");
        System.out.println("Kırmızı Takım "+kirmizi+"Mavi Takım: "+mavi);
        System.out.println("2. Tur başlıyor, bu turda her soru 7,5 puan");
        System.out.println("Yarışma sonu");
        System.out.println("Kırmızı Takım Skoru: "+topla (kirmizi,15));
        System.out.println("Mavi Takım Skoru: "+topla (mavi,22.5));
    }
    static int topla (int a, int b)
    {
        return a+b;
    }
    static double topla (int a, double b)
    {
        return a+b;
    }
    static double topla (double a, int b)
    {
        return a+b;
    }
    static double topla (double a, double b)
    {
        return a+b;
    }
}
