import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int r, a;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz:");
        r= inp.nextInt();
        System.out.println("Merkez Açısını Giriniz:");
        a=inp.nextInt();

        double alan=  (pi * (r*r) * a) / 360;

        System.out.println("Daire Diliminin Alanı="+ alan);


    }
}