package sayisirala;

import java.util.Scanner;

public class sayisirala {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("a sayısını giriniz: ");
        int a = scan.nextInt();
        System.out.print("b sayısını giriniz: ");
        int b = scan.nextInt();
        System.out.print("c sayısını giriniz: ");
        int c = scan.nextInt();

        if (a>b && a>c) {
            System.out.println("a en büyük sayıdır.");
        } else if (b>a && b>c) {
            System.out.println("b en büyük sayıdır.");
        }else {
            System.out.println("c en büyük sayıdır.");
        }
    }
}
