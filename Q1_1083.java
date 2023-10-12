/*
 * Name: Dheeraj Kumar
 * 
 * PS LINK: https://cses.fi/problemset/task/1083
 */
import java.util.Scanner;

public class Q1_1083{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=0;i<n-1;i++){
            arr[sc.nextInt()]++;
        }
         for(int i=1;i<n+1;i++){
            if(arr[i]==0){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}