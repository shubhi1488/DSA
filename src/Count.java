/*
Write a program to find out and return the number of digits present in the number recusively.
sample input:156
sample output:3
sample input:7
sample output:1
 */
import java.util.Scanner;

public class Count {
    public static int CountDigits(int n)
    {
        //base condition if digits of n is less than 10 then it will return 1 0-9 it will return 1
        if(n/10==0){
            return 1;
        }
        //for number which is n>=10
        //recursive call
        return 1+CountDigits(n/10);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        Count obj=new Count();
        System.out.println("digits of the number are:"+obj.CountDigits(n));
    }
}
