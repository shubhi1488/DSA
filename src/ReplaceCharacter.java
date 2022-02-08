/*
Given an input string s and two characters char1 and char2 you need to replace every occurance
of character c1 with character c2 in the given string.
do this recursively.
sample input:abaca
a x
sample output:xbxcd
 */
import java.util.Scanner;

public class ReplaceCharacter {
    public static String replaceCharacter(String str,char c1,char c2){
        //if string is empty then it will return the string only
        if(str.length()==1)//...........................base condition.........................
        {
            return str;
        }

        char x=str.charAt(0);
        if(str.charAt(0)==c1){
            x=c2;//if the character at the starting of the string is equal to c1 then replace it with c2
            str=c2+str.substring(1);
        }
        //recursive call of the function
        return x+replaceCharacter(str.substring(1),c1,c2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();
        System.out.println("enter a character to be removed: ");
        char c1=sc.next().charAt(0);
        System.out.println("enter a character :");
        char c2=sc.next().charAt(0);
        ReplaceCharacter obj=new ReplaceCharacter();

        System.out.println("string after replacing the characters:"+obj.replaceCharacter(str,c1,c2));
    }
}
