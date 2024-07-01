import java.util.*;
 
public class Solution{
               public static void main(String[] args){
                              Scanner sc = new Scanner(System.in);
                              
                              int t = sc.nextInt();
                              while(t-->0){
                                             int n = sc.nextInt();
                                             int m = sc.nextInt();
                                             
                                             String x = sc.next();
                                             String s = sc.next();
                                           
                                           int count =0;  
               while( (s.length()+(n-1))>x.length() ){
                                                
                                                if(x.contains(s)){
                                                          break;
                                                }    
                                                
                                                x = x + x;
                                                count++;
                                                            
                                             }
                                              if(x.contains(s)) System.out.println(count);
                                             else System.out.println("-1");
                              }
               }
}
