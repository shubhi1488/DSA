public class Factorial {
    //head recursion-in this we mention statements after the recursive call
    public static int fact(int n){
        if(n==1)//.................................base condition....
        {
            return 1;
        }
        //recursive call
        int recans=fact(n-1);//it will continously decrease the value of n till it becomes 0
        int myans=n*recans;//it will find the factorial and prform the calculation.
        return myans;
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(fact(n));
    }
}
