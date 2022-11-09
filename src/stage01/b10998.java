package stage01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10998 {
    private int a,b;
    private String str;
    public b10998() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(a <= 0 || b >= 10) {
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
        }
        System.out.println(a * b);
    }

    public static void main(String[] args) throws IOException {
        new b10998();
    }
}
