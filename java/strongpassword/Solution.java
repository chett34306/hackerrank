
//https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true

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
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */
    /* Test cases failing
    //TC1: 
        7
        AUzs-nV
        Expected: 1
    //TC2:
        7
        #cP!F9Z
        Expected: 0
    //TC3:
        8
        zC9!Xx56
        Expected: 0
    //TC4:
        100
        G0N1+93Gy0C!J4ECIc53+30O9az$K-TgDO^051y2+Qfvt94qI!k)lS(-8g65^A9mt%eRL5WP#f8R)i4O33j#&LNk6H%-pr-@d^*Z
        Expected: 0
    */
    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
        int strong_password_check = 0;
        boolean has_check_az = false;
        boolean has_check_AZ = false;
        boolean has_check_09 = false;
        boolean has_check_symbols = false;
        for(int i = 0; i < password.length(); i++)
        {
            //check each char existence in  
            /*
            numbers = "0123456789"
            lower_case = "abcdefghijklmnopqrstuvwxyz"
            upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            special_characters = "!@#$%^&*()-+"
            */
            if(!has_check_az && Pattern.matches("[a-z]", String.valueOf(password.charAt(i))))
            {
                strong_password_check = strong_password_check + 1;
                has_check_az = true;
                //System.out.println("has_check_az: " + "true");
            }
            
            if(!has_check_AZ && Pattern.matches("[A-Z]", String.valueOf(password.charAt(i))))
            {
                strong_password_check = strong_password_check + 1;
                has_check_AZ = true;
                //System.out.println("has_check_AZ: " + "true");
            }
            
            if(!has_check_09 && Pattern.matches("[0123456789]", String.valueOf(password.charAt(i))))
            {
                strong_password_check = strong_password_check + 1;
                has_check_09 = true;
                //System.out.println("has_check_09: " + "true");
            }
            
            if(!has_check_symbols && Pattern.matches("[!@#$%^&*()+-]", String.valueOf(password.charAt(i))))
            {
                strong_password_check = strong_password_check + 1;
                has_check_symbols = true;
                //System.out.println("has_check_symbols: " + "true");
            }
        }
        
        //System.out.println("strong_password_check: " + strong_password_check);
            return Math.max(4 - strong_password_check, 6 - password.length());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
