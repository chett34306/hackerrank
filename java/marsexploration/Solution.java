//https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true


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
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
    // Write your code here
    int count_altered = 0;
    if(s.length() > 99 || s.length() < 1) return 0;
    
    int count_sos = s.length()/3;
    //System.out.println(count_sos);
    for(int j = 0; j < s.length(); j = j + 3)
    {
        String sub_str = s.toLowerCase().substring(j, j + 3);
        //System.out.println(sub_str);
        //System.out.println(j);
        if(sub_str != "sos")
        {
                if(sub_str.toLowerCase().charAt(0) != 's')
                {
                    count_altered =    count_altered + 1;         
                }
                if(sub_str.toLowerCase().charAt(1) != 'o')
                {
                    count_altered =    count_altered + 1;         
                }
                if(sub_str.toLowerCase().charAt(2) != 's')
                {
                    count_altered =    count_altered + 1;         
                }
                
        }
    }
    return count_altered;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
