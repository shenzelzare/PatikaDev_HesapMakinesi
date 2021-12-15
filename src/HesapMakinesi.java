import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sayi1,sayi2,result;
        System.out.println("sayi1 giriniz");
        sayi1 = scanner.nextInt();
        System.out.println("sayi2 giriniz");
        sayi2 = scanner.nextInt();
        System.out.print("1-Topla\n 2-Cikar \n 3-Carp\n 4-Bol\n");
        System.out.println("Seciniz : ");
        int operator = scanner.nextInt();
        switch (operator){
            case 1:
                result = (sayi1+sayi2);
                System.out.println("toplam : "+result);
                break;
            case 2:
                result = (sayi1-sayi2);
                System.out.println("cıkarma : "+result);
                break;
            case 3:
                result = (sayi1*sayi2);
                System.out.println("carpma : "+result);
                break;
            case 4:
                if (sayi2!=0) {
                    result =(double) (sayi1/sayi2);
                    System.out.println("bolme : "+result);
                }
                else{
                    System.out.println("sayi 2 = 0 olamaz");
                }
                break;
            default:
                System.out.println("hatali giris yapildi");
        }
    }


}
