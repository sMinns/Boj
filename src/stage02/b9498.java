package stage02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int str = Integer.parseInt(br.readLine());
        if(str >= 90 && str <= 100) {
            System.out.println("A");
        }else if(str >= 80) {
            System.out.println("B");
        } else if (str >= 70) {
            System.out.println("C");
        } else if (str >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
