//print the lexicographical order with the intial and end value entered by user.....
import java.util.Scanner;

public class Lexicographicalorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter intial value:");
        int initial=sc.nextInt();
        System.out.println("enter end value:");
        int end=sc.nextInt();
       m1(initial,end);
        System.out.println("total number of counts:"+c);
    }

    static int c=0;//.................declaring the static variable c=0 to count the lexicographical order
    public static void m1(int initial,int end){
        //base case........................
        if(initial>end)//................if initial value is greater than end value than it will take the control out .
        {
            return;
        }
        c++;//..................before every recursive call we increase the count variable.
        System.out.println(initial);
        int i=0;//..............creating the local variable
        if(initial==0)//..........if number start with 1 than loop will traverse 9 times and if 0 than 10 times
        {
            i=1;
        }
        while(i<10){
            m1(initial*10+i,end);//..........recursive call
            i++;//.........increasing the value of i by 1
        }
    }
}
