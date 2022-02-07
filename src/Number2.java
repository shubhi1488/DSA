/*
Write  a program to print numbers from 1 to n in increasing order recursively
sample input:6
sample output:1 2 3 4 5 6......
 */
public class Number2 {
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n=6;
        print(n);
    }
}
