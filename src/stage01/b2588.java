package stage01;

import java.io.IOException;
import java.util.Scanner;

public class b2588 {
    public b2588() throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            System.out.println(a * (int) (b / Math.pow(10, i) % 10));
        }
        System.out.println(a * b);
    }
    public static void main(String[] args) throws IOException {
        new b2588();
    }
}
