  /*
 * Name: Dheeraj Kumar
 * Reg no.:2241011127
 * PS LINK: https://cses.fi/problemset/task/2205/
 */
 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Q9 {
  

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        List<String> grayCode = generateGrayCode(n);

        for (String code : grayCode) {
            System.out.println(code);
        }
    }

    public static List<String> generateGrayCode(int n) {
        List<String> grayCode = new ArrayList<>();
        if (n <= 0) {
            grayCode.add("");
            return grayCode;
        }

        List<String> previousGrayCode = generateGrayCode(n - 1);
        for (String code : previousGrayCode) {
            grayCode.add("0" + code);
        }
        for (int i = previousGrayCode.size() - 1; i >= 0; i--) {
            grayCode.add("1" + previousGrayCode.get(i));
        }

        return grayCode;
    }
}

    

