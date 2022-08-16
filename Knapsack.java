import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int ii=0;ii<t;ii++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            int w[] = new int[k+1];
            for(int i=0;i<n;i++){
                for(int j=arr[i];j<=k;j++){
                    w[j] = Math.max(w[j],arr[i]+w[j-arr[i]]);
                }
            }
            System.out.println(w[k]);
        }
    }
}
