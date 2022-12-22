package stage02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a == b) {
            if(a == c) {
                System.out.println((a * 1000) + 10000);
            }else {
                System.out.println((a * 100) + 1000);
            }
        }else if(b == c) {
                System.out.println((b * 100) + 1000);
        }else if(a == c) {
            System.out.println((c * 100) + 1000);
        }else {
            System.out.println(Math.max(Math.max(a, b), c) * 100);
        }
    }
}
