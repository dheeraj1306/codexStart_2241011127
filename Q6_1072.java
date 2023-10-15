/*
 * Name: Dheeraj Kumar
 * Reg no.:2241011127
 * PS LINK: https://cses.fi/problemset/task/1072/
 */
import java.util.Scanner;

public class Q6_1072 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long input1=Integer.parseInt(sc.nextLine());
        long result,combination,count;
        count=0;
        for(long i=1;i<=input1;i++){
            if(i==1){
                result=0;
            }else{
                combination =(i*i)*(i*i-1)/2;
                result=(combination-8*count);
                count=count+i-1;
            }
            System.out.println(result);
        }

      }
    
}
