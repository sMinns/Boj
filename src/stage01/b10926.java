package stage01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10926 {
    private String str;
    public b10926() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        System.out.println(str + "??!");
    }

    public static void main(String[] args) throws IOException {
        new b10926();
    }
}
