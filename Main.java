import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int r;
        double pi=3.14;

        Scanner input=new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz:");
        r=input.nextInt();
        double alan=pi*r*r;
        double cevre=2*pi*r;

        System.out.println("Dairenin alanı:"+alan);
        System.out.println("Dairenin cevresi:"+cevre);*/
        int r,dDilimi;
        double pi=3.14;
        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz:");
        r=input.nextInt();
        System.out.println("Daire dilimini giriniz:");
        dDilimi=input.nextInt();

        double dDilimiAlani=(pi*r*r*dDilimi)/360;
        System.out.println("Daire Diliminin Alanı:"+dDilimiAlani);

    }
}