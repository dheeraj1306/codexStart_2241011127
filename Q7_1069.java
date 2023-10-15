/*
 * Name: Dheeraj Kumar
 * Reg no.:2241011127
 * PS LINK: https://cses.fi/problemset/task/1069/
 */
import java.util.Scanner;

public class Q7_1069 {
    public static void main(String[] args) {
        long max=1;
        long curr=1;
        Scanner sc=new Scanner(System.in);
        String dna=sc.nextLine();
        for(int i=0;i<dna.length()-1;++i){
            if(dna.charAt(i)==dna.charAt(i+1)){
                curr++;

            }else{
                if(max<curr){
                    max=curr;
                }
                curr=1;
            }
        }
        if(max<curr){
            max=curr;
        }
        System.out.println(max);


    
}
    
}
