/*
Write a program to find and return the sum of all elements of the array.Do this recursively.
sample input:3
9 8 9
sample output:26
 */
import java.util.Scanner;

public class SumArray {
    public static int CalculateSum(int arr[],int n){
        //base condition if the size of array is 0 than it will return 0
        if(n<=0){
            return 0;
        }
        //for rest of cases
        //recursive call
        return CalculateSum(arr,n-1)+arr[n-1];
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of the array;");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SumArray obj=new SumArray();
        System.out.println("sum of the elements of array:"+obj.CalculateSum(arr,n));

    }
}
