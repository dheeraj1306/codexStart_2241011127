  /*
 * Name: Dheeraj Kumar
 * Reg no.:2241011127
 * PS LINK: https://cses.fi/problemset/task/1618/
 */
  import java.util.Scanner;

public class Q10_1618 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();
    
            int count = countTrailingZeros(n);
            System.out.println(count);
        }
    
        static int countTrailingZeros(int n) {
            int count = 0;
    
            // Keep dividing n by powers of 5 and counting the results
            while (n >= 5) {
                n /= 5;
                count += n;
            }
    
            return count;
        }
    }
    
       
    


    





    
