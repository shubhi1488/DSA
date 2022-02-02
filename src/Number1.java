//program to print the N numbers in reverse order using recursion......
public class Number1 {
    public static void print(int n){
        if(n==0)//base case
        {
            return;
        }
        System.out.println(n);//it will print the value then decrease the number
        print(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        print(n);

    }
}
