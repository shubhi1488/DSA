//write a program to find factorial using tail recursion.........
public class Factorial2 {
    public static void factorial(int n,int ans){
        if(n==1||n==0){
            System.out.println(ans);
            return;
        }
        factorial(n-1,ans*n);

    }

    public static void main(String[] args) {
        int n=4,ans=1;
        factorial(n,ans);

    }
}
