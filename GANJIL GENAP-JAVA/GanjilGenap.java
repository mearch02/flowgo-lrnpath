import java.util.*;
import java.lang.Math;

public class JavaApplication {
    public static void main(String[] args) {
        int angka;
        
        angka = 1;
        while (angka <= 10) {
            if (angka % 2 == 0) {
                System.out.println("genap=" + angka);
            } else {
                System.out.println("ganjil=" + angka);
            }
            angka = angka + 1;
        }
    }
}
