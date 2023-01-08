package stage04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[9];
        int n = 0, max = 0;
        for (int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            if(nums[i] > max) { max = nums[i]; n = i+1; }
        }
        System.out.println(max);
        System.out.println(n);
    }
}
