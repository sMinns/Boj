package stage01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class b3003 {
    String str;
    int[] count = {1, 1, 2, 2, 2, 8};
    String result = "";
    public static void main(String[] args) throws IOException {
        new b3003();
    }

    public b3003() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        for (int i = 0; i < 6; i++) {
            result += count[i] - Integer.parseInt(st.nextToken()) + " ";
        }
        System.out.println(result);
    }
}
