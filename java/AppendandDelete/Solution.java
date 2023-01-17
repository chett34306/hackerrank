//https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true

package AppendandDelete;

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
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
    // Write your code here
    int mid_way = 0;
    if (k%2 == 0)
    {
        mid_way = k/2;
    }
    else
    {
        mid_way = k/2 + 1;
    }
    if (s.equalsIgnoreCase(t))
    return "Yes";

    String s_substring1 = s.substring(0, mid_way + 1);
    String s_substring2 = s.substring(mid_way + 1, s.length());

    String t_substring1 = t.substring(0, mid_way + 1);
    String t_substring2 = t.substring(mid_way + 1, t.length());

    if(s_substring2.length() + t_substring2.length() <= k)
    {
        String s_newstring = s_substring1 + t_substring2;
        if(s_newstring.equalsIgnoreCase(t))
        {
            return "Yes";
        };
    }

    return "No";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
