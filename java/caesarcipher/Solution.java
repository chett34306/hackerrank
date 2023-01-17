
//https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true

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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
    //Hello_World! --> 4 --> Lipps_Asvph! , Lipps_[svph!
    String newstring = "";
    if(k > 26)
    {
        k = k - 26*(k/26);
    }
    System.out.println("K value:" + k);
    for(int i = 0; i < s.length(); i++)
    {
        if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
        {
            if((int)(s.charAt(i)) + k <= (int)('z'))
            {
                newstring = newstring + (((char)((int)(s.charAt(i)) + k)));
            }else
            {
                newstring = newstring + (((char)((int)('a') + k - ( (int)('z') - (int)(s.charAt(i)) ) - 1 )));
            }
        }
        else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
        {
            if((int)(s.charAt(i)) + k <= (int)('Z'))
            {
                newstring = newstring + (((char)((int)(s.charAt(i)) + k)));
            }else
            {
                newstring = newstring + (((char)((int)('A') + k - ( (int)('Z') - (int)(s.charAt(i)) ) - 1 )));
            }
        }
        else
        {
            newstring = newstring + (s.charAt(i));
        }
    }
    return newstring;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
