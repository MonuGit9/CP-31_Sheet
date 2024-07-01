import java.util.*;
 
public class Solution{
               public static void main(String[] args){
                              Scanner sc = new Scanner(System.in);
                              
                              int t = sc.nextInt();
                              
                              while(t-->0){
                                             int n = sc.nextInt();
                                             int[] arr = new int[n];
                                             for(int i =0;i<n;i++) {arr[i] = sc.nextInt();}
                                             
                                             
                                             Arrays.sort(arr);
                                             
                                             if(arr[0]==arr[n-1]){
                                                     System.out.println("Yes");
                                             } else{
                                                int size = arr[n-1]+1;
                                                int[] freq = new int[size];
                                                for(int i =0;i<n;i++){
                                                freq[arr[i]] +=  1;
                                             }
                                             Arrays.sort(freq);
                                             
                                       if( n%2==0 && freq[size-2]== n/2 && freq[size-1]== n/2 ) {
                                       System.out.println("Yes"); 
                                       }
                                       else if( n%2!=0 && freq[size-2]== n/2 && freq[size-1]== (n+1)/2 ){
                                                        System.out.println("Yes"); 
                                       }else{
                                               System.out.println(" No");        
                                       }
                              }
                              }
                              }
}
