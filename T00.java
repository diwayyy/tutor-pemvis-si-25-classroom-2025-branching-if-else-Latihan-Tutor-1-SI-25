//12S25003-Afrian Jose Siadari
//12S25004-Sapna Agnes Napitupulu
//12S25042-Dewi Natasya Sitorus
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i1, i2, hk, hj;

        i1 = Integer.parseInt(input.nextLine());
        i2 = Integer.parseInt(input.nextLine());
        if (i1 % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (i2 % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (i1 > i2) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (i1 < i2) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (i1 % 2 == 0 && i2 % 2 == 0) {
            hj = i1 + i2;
            System.out.println("Hasil penjumlahan: " + hj);
        } else {
            if (i1 % 2 != 0 && i2 % 2 != 0) {
                hk = i1 * i2;
                System.out.println("Hasil perkalian: " + hk);
            }
        }
        if (i1 % 2 != 0 && i2 % 2 == 0) {
            System.out.println("Berbeda jenis");
        } else {
            if (i2 % 2 != 0 && i1 % 2 == 0) {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
