/*Consider a sequence of integers. We want to delete exactly one element such that the difference
between the smallest and largest elements in the sequence is minimal.
Then print the minimal absolute difference between the maximal and minimal elements on a new line.*/

// I will sort the array then if dif(a[n-1], a[1]) < dif(a[n - 2], a[0]) then delete a[0], else delete a[n-1]
// Delete either the max or min element by not add it into the array list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MinOfMaxMinDif {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        Arrays.sort(a);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(Math.abs(a[n - 1] - a[1]) <= Math.abs(a[n - 2] - a[0]))
            {
            for(int i = 1; i < n ; i++)
                {
                list.add(a[i]);
            }
        }
        else
            {
            for(int i = 0; i < n-1; i++)
                {
                list.add(a[i]);
            }
        }

        System.out.println(Math.abs(list.get(list.size() - 1) - list.get(0)));
    }
}
