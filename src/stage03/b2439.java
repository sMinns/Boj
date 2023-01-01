package stage03;

import java.io.*;

public class b2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if(j < i)
                    bw.write(" ");
                else
                    bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
