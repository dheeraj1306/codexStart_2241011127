/*
 * Name: Dheeraj Kumar
 * Reg no.:2241011127
 * PS LINK: https://cses.fi/problemset/task/1070/
 */
import java.util.*;
public class Q4 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int count= Integer.parseInt(sc.nextLine());
    List<String> n1=new ArrayList<>();
    List<String> n2=new ArrayList<>();
    if(count==1){
        System.out.print("1");
    }
    else if(count==3||count==2){
        System.out.print("NO SOLUTION");
    }else{
        for(int i=0;i<count/2;i++){
            n1.add((2*i+2)+"");
            n2.add((2*i+1)+"");
        }
        if(count%2==1){
            n2.add(count+"");
        }
        System.out.print(String.join(" ", n1));
        System.out.print(" ");
        System.out.print(String.join(" ", n2));
    }

}
}

