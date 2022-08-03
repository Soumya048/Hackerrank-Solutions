/*
 A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Read : How to reverse string in Java ?


 
Constraints
A will consists at most 50 lower case English letter.

Sample Input
 madam
Sample Output
 Yes
 * */

package JavaStringReverse;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        String revStr = "";
        
        for(int i = A.length() - 1; i >= 0; i--) {
            revStr += A.charAt(i);
        }
        
        System.out.println(A.equals(revStr) ? "Yes" : "No");
    }
}
