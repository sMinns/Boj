package stage03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class b10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            result.add(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }
        for (Integer r : result) {
            System.out.println(r);
        }
    }
}
