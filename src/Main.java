import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yas,secim;
        float mesafe;
        double ucret;
        double yas_indirim;
        double normal_tarife;
        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz:");
        mesafe = input.nextFloat();

        System.out.println("Yaşınızı giriniz:");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini seçiniz:\n 1-)Gidiş \n 2-)Gidiş-Dönüş");
        secim = input.nextInt();

        normal_tarife = mesafe*0.10;
    if(yas>0 && (secim==1 || secim==2) && mesafe>0 ) {
        if(yas<12){
            ucret = normal_tarife/2;
                if(secim==2){
                    yas_indirim = (ucret - (ucret * 0.20))*2;
                    System.out.println("Toplam tutar:" + yas_indirim);
                }else if(secim==1){
                    System.out.println("Toplam tutar:" + ucret);
                }
        }

        if(yas>12 && yas<24){
            ucret = normal_tarife-(normal_tarife*0.10);
                if(secim==1){
                    System.out.println("Toplam tutar:" + ucret);
                }else if(secim==2){
                    yas_indirim= (ucret- (ucret*0.20))*2;
                    System.out.println("Toplam tutar:" + yas_indirim);

                }
        }

        if(yas>24 && yas<65){
            if (secim==1){
                System.out.println("Toplam tutar:"+ normal_tarife);
            } else if (secim==2) {
                ucret = (normal_tarife-(normal_tarife*0.20))*2;
                System.out.println("Toplam tutar:" + ucret);
            }

        }


        if(yas>65){
            ucret=normal_tarife-(normal_tarife*0.30);
                if(secim==1){
                    System.out.println("Toplam tutar:" + ucret);
                }
                else if(secim==2){
                    yas_indirim= (ucret-(ucret*0.20))*2;
                    System.out.println("Toplam tutar:" + yas_indirim);
                }
        }


        }else {
            System.out.println("Hatalı veri girdiniz!");
        }
        }
        }