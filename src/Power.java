/*
Write a program to find x to the power n(i.e. x^n).Take x and n from the user.
you need to return the answer.Do this recursively.
Sample Input:3 4
Sample Output :81
 */
import java.util.Scanner;

public class Power {
    public static int power(int x,int n){
        //base case if n=0 then return 1 and if x is 0 then return 0
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //in other cases where value of x and n is not 0
        return x*power(x,n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int x=sc.nextInt();
        System.out.println("enter power:");
        int n=sc.nextInt();
        Power obj=new Power();

        System.out.println("number raised to the power is:"+obj.power(x,n));
    }
}
