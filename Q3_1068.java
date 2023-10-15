/*
 * Name: Dheeraj Kumar
 * Reg no.:2241011127
 * PS LINK: https://cses.fi/problemset/task/1068
 */
import java.util.Scanner;

public class Q3_1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        
        while (n != 1) {
            System.out.print(n + " ");

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
           
        }
         if (n == 1) {
                System.out.print(n + " ");
            }
        }
    }
