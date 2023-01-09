package stage04;

import java.io.*;

public class b5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] barr = new boolean[30];

        for (int i = 0; i < 28; i++) {
            barr[Integer.parseInt(br.readLine()) - 1] = true;
        }

        for(int i = 0; i < 30; i++) {
            if(!barr[i]) {
                bw.write(i + 1 + "\n");
            }
        }
        bw.flush();
    }
}
