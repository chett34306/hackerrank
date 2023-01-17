//https://www.hackerrank.com/challenges/chocolate-feast/problem?isFullScreen=true

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
     * Complete the 'chocolateFeast' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER c
     *  3. INTEGER m
     */

    public static int chocolateFeast(int n, int c, int m) {
    // Write your code here.  tc1: 6, 2, 2
    int wrappers_needed = m;
    int wrappers_remaining = m;
    int cost_choco_bar = c;
    int initial_amount = n;
    int bar_count = 0;
    int bar_count_from_wrapper = 0;
        while(initial_amount >= cost_choco_bar)
        {
            bar_count = initial_amount/cost_choco_bar;
            initial_amount = initial_amount%cost_choco_bar;
            wrappers_remaining = bar_count;
        }
        
        while(wrappers_remaining >= wrappers_needed)
        {
            bar_count_from_wrapper = bar_count_from_wrapper + wrappers_remaining/wrappers_needed;
            
            wrappers_remaining = wrappers_remaining - bar_count_from_wrapper*wrappers_needed + bar_count_from_wrapper;
        }
        return bar_count + bar_count_from_wrapper;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int c = Integer.parseInt(firstMultipleInput[1]);

                int m = Integer.parseInt(firstMultipleInput[2]);

                int result = Result.chocolateFeast(n, c, m);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
