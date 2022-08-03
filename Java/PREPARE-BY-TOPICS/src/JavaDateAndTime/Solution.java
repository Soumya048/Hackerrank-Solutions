/*
You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.


 
Example

month = 8 day = 14 year = 2017


The method should return MONDAY as the day on that date.


Function Description
Complete the findDay function in the editor below.

findDay has the following parameters:

int: month
int: day
int: year
Returns
string: the day of the week in capital letters


Input Format
A single line of input containing the space separated month, day and year, MM DD YYYY respectively, in format.


Constraints
2000 <= year <= 3000

Sample Input
 08 05 2015
 
Sample Output
 WEDNESDAY
 
Explanation
The day on August 15th 2015 was WEDNESDAY.
 * */

package JavaDateAndTime;

import java.io.*;
import java.time.LocalDate;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        int m = Integer.valueOf(month);
        int d = Integer.valueOf(day);
        int y = Integer.valueOf(year);
        
        LocalDate date =  LocalDate.of(y, m, d);
        return date.getDayOfWeek().toString(); 
    }

}
public class Solution {
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int month = Integer.parseInt(firstMultipleInput[0]);

	        int day = Integer.parseInt(firstMultipleInput[1]);

	        int year = Integer.parseInt(firstMultipleInput[2]);

	        String res = Result.findDay(month, day, year);

	        bufferedWriter.write(res);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
}
