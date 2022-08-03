/*
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks. It's time to test your knowledge of Static initialization blocks. You can read about it here.
 
You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input. If B <0 or H<0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format :-
There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of
the parallelogram.
Constraints :-
-100 < B < 100
-100 <H< 100
Output Format :-
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1 :-
1
3
Sample output 1 :-
3
Sample input 2 :-
-1
2
Sample output 2 :-
java.lang.Exception: Breadth and height must be positive
 * */

package JavaStaticInitializerBlock;

import java.util.*;

public class Solution {
	
    public void areaParallelogram(int b, int l) throws NegativeException {
        if(b > 0 && l > 0) {
            System.out.println(b*l);
        }
        else {
            throw new NegativeException("java.lang.Exception: Breadth and height must be positive");
        }
}

public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc = new Scanner(System.in);
    
    while(sc.hasNextInt()) {
        int B = sc.nextInt();
        int L = sc.nextInt();
        try{
            Solution s1 = new Solution();
            s1.areaParallelogram(B, L);
        }
        catch(NegativeException e) {
            System.out.println(e.getMessage());
        } 
    }
}

}


class NegativeException extends Exception {
    NegativeException() {}
    NegativeException(String m) {
        super(m);
    } 
}