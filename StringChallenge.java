/* Given a number of Strings that have length n that is indexed from 0 to n-1, 
print the even-indexed and odd-indexed characters as a space-separated strings on a single line. */



import java.io.*;
import java.util.*;

public class StringChallenge {

    public static void main(String[] args) {
        //Scan the number of strings.
        Scanner sc = new Scanner(System.in);
        int nStr = sc.nextInt();
        String str = "";
        for(int i = 0; i < nStr; i++)
            {
            str = sc.next(); //Scan the string.
            for(int j = 0; j < str.length(); j+=2) //Print characters at index 0, 2, 4,...
                {
                System.out.print(str.charAt(j));
            }
            System.out.print(" "); //Print space.
            for(int j = 1; j < str.length(); j+=2) //Print characters at index at 1, 3, 5,...
                {
                System.out.print(str.charAt(j));
            }
            System.out.println(""); //New line.
            str = "";
        }
        sc.close();
    }
}
