import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String gender;
        
        System.out.println("menemukan jenis kelamin");
        gender = input.nextLine();
        if (gender.equals("laki-laki")) {
            System.out.println("Anda laki-laki");
        } else {
            if (gender.equals("perempuan")) {
                System.out.println("Anda perempuan");
            } else {
                System.out.println("Tidak memiliki gender");
            }
        }
    }
}
