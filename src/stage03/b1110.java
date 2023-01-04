package stage03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int a = num;
        int count = 0;
        do {
            a = (a % 10 * 10) + (((a / 10) + (a % 10)) % 10);
            count++;
        } while (a != num);
        System.out.println(count);
    }
}
