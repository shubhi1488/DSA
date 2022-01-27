import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("enter values in array");
            arr[i]=s.nextInt();

        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}
