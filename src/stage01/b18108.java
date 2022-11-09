package stage01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b18108 {
    private int year;
    public b18108() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        year = Integer.parseInt(br.readLine());
        System.out.println(year - 543);
    }

    public static void main(
            String[] args) throws IOException {
        new b18108();
    }
}
