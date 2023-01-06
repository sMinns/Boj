package stage04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int max = -1000001, min = 1000001;
        for (int i = 0; i < n; i++) {
            if(nums[i] > max)
                max = nums[i];
            if (nums[i] < min)
                min = nums[i];
        }
        System.out.println("" + min + " " + max);
    }
}
