package stage02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        m -= 45;
        if(m < 0) {
            h -= 1;
            m = 60 - Math.abs(m);
        }
        if(h < 0) {
            h = 24 - Math.abs(h);
        }
        System.out.println(h + " " + m);
    }
}
