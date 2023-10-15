 /*
 * Name: Dheeraj Kumar
 * Reg no.:2241011127
 * PS LINK: https://cses.fi/problemset/task/2165/
 */
 import java.util.*;
 ;public class Q8 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
    
            int moves = towerOfHanoi(n, 1, 3, 2);
    
            System.out.println(moves);
            towerOfHanoiWithOutput(n, 1, 3, 2);
        }
    
        // Function to calculate the minimum number of moves
        public static int towerOfHanoi(int n, int source, int destination, int auxiliary) {
            if (n == 1) {
                return 1;
            } else {
                int moves1 = towerOfHanoi(n - 1, source, auxiliary, destination);
                int moves2 = 1;
                int moves3 = towerOfHanoi(n - 1, auxiliary, destination, source);
                return moves1 + moves2 + moves3;
            }
        }
    
        // Function to print the move sequence
        public static void towerOfHanoiWithOutput(int n, int source, int destination, int auxiliary) {
            if (n == 1) {
                System.out.println(source + " " + destination);
            } else {
                towerOfHanoiWithOutput(n - 1, source, auxiliary, destination);
                System.out.println(source + " " + destination);
                towerOfHanoiWithOutput(n - 1, auxiliary, destination, source);
            }
        }
    }
    
    

