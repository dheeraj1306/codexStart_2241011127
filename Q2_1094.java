
/*
 * Name: Dheeraj Kumar
 * Reg no.:2241011127
 * PS LINK: https://cses.fi/problemset/task/1094/
 */
import java.util.Arrays;
import java.util.Scanner;

public class Q2_1094 {
    public static void main(String[] args) {
        long count=0;
        Scanner sc = new Scanner(System.in);
        long input1=Integer.parseInt(sc.nextLine());
        long[] number=Arrays.stream(sc.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        for(int i=0;i<number.length-1;i++){
            if(number[i]>number[i+1]){
                count+=number[i]-number[i+1];
                number[i+1]=number[i];

            }
        } 
        System.out.println(count);      
        
    }


}