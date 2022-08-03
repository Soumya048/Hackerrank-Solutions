/*
 
 * */

package JavaSHA_256;

import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.nextLine();
        sc.close();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(inputWord.getBytes("UTF-8"));
            byte[] byteHash = md.digest();
            
            for (byte b:byteHash) {
                System.out.format("%02x", b);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
