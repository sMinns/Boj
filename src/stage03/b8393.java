package stage03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b8393 {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
