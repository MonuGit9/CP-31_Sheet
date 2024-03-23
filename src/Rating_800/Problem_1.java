package Rating_800;
import java.util.*;

public class Problem_1 {

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int  n = sc.nextInt();
            int k = sc.nextInt();
            int[] boxes = new int[n];
            for (int i = 0; i<n;i++){
                boxes[i] =sc.nextInt();
            }

            if(k==1 && !isSorted(boxes)){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }

        }
    }
}
