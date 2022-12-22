package stage03;

import java.io.IOException;
import java.util.Scanner;

public class b2739 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", a, i, a * i);
        }
    }
}
