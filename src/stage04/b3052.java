package stage04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class b3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> nums = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            nums.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(nums.size());
    }
}
