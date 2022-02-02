//write a program to create a fibonacci series using recursive call(tail recursion).......
public class Fibonacci {
    public static int Fib(int n){
        if(n==0||n==1)//.................base case...............
        {
            return n;//if the value of n is 0 or 1 than the value of n will be printed....
        }
        //recursive call of the method created......
        return Fib(n-1)+Fib(n-2);//f(n)=f(n-1)+f(n-2)
    }

    public static void main(String[] args) {
        int n=2;
        System.out.println(Fib(n));
    }
}
