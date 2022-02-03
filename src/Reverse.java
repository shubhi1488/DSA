import java.util.Scanner;
//program to find the reverse number using recursive function....
public class Reverse {
    public static void ReverseNumber(int num){
            if(num<10)//base condition
            {
                System.out.println(num);
                return;
            }
            else{
                System.out.println(num%10);
                //recursive call(tail recursion)
                ReverseNumber(num/10);
            }
        }

        public static void main(String[] args) {
            int num;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            num=sc.nextInt();
            System.out.println("reversed number is:");
            ReverseNumber(num);


        }

    }

