/*Logan wants to go to the movies on some day x satisfying i<= x <=j, but he only want to go to the movies on beautiful days. He considers a day to be beautiful if the absolute value of the difference between x and reverse version of x is evenly divisible by k. 
Given i, j and k, count and print the number of beautiful days when he can go to the movies.*/

import java.io.*;
import java.util.*;

public class BeautifulDay {
    
    public static int getReverseInt(int value) {
    int resultNumber = 0;
    for(int i = value; i !=0; i /= 10) {
        resultNumber = resultNumber * 10 + i % 10;
    }
    return resultNumber;        
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;
        for(int a = i; a <= j; a++)
        {
            if((Math.abs(a - getReverseInt(a)) % k) == 0)
            {
                count++;
            }
        }
        
        System.out.println(count);
       
    }
}
