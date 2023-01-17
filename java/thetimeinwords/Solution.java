package thetimeinwords;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
    // Write your code here
      //create an string array for spelling hours 1 - 12;
      //create an strign array for minutes as well 1-29
      //create an string array for 15, 30, as quarter half
      //put various conditions for m
      //parse the inputs and print.
      String[] spell_hours = {"one", "two", "three", "four", "five", "six", 
                                "seven", "eight", "nine", "ten", "eleven", "twelve"};
                                        
      String[] spell_minutes = {"one", "two", "three", "four", "five", "six", 
                                "seven", "eight", "nine", "ten", "eleven", "twelve",
                                        "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                                        "eighteen", "Nineteen", "twenty", "twenty one",
                                        "twenty two", "twenty three", "twenty four", "twenty five","twenty six", "twenty seven", "twenty eight", "twenty nine"};
      String[] spell_quarters = {"quarter", "half"};
      if(m == 0)
      {
          return spell_hours[h-1] + " o' clock";
      }else if(m >= 1 && m <= 30)
      {   //put a cond for m == 15, and m == 30
          if(m == 15)
          {
              return spell_quarters[0] + " past " + spell_hours[h-1];
          }
          if(m == 30)
          {
              return spell_quarters[1] + " past " + spell_hours[h-1];
          }
          if( m >= 1 && m <= 9)
          {
              return spell_minutes[m - 1] + " minute past " + spell_hours[h-1];
          }else
          {
              return spell_minutes[m - 1] + " minutes past " + spell_hours[h-1];
          }
          
      }
      else if(m > 30)
      {
          if(m == 45)
          {
              return "quarter to " + spell_hours[h];
          }else
          {
              int min_to_top_of_hour = 60 - m;
              return spell_minutes[min_to_top_of_hour - 1] + " minutes to " + spell_hours[h];
          }
      }
      
      return "null";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedWriter.write("input: " + h + ":" + m);
        bufferedWriter.newLine();
        String result = Result.timeInWords(h, m);
        System.out.println(result);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
