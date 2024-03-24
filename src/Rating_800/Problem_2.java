package Rating_800;

import java.util.Scanner;
import java.lang.Math;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int ans = Integer.MIN_VALUE;
            int prev = 0;
            for(int i =0;i<n;i++){
                ans = Math.max(ans,arr[i]-prev);
                prev = arr[i];
            }

            ans = Math.max(ans, ((x-prev)*2));

            System.out.println(ans);
        }

    }
}
