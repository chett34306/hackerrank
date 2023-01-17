//https://www.hackerrank.com/challenges/smart-number/problem?isFullScreen=true
package smartnumber;

import java.io.*;
import java.util.*;

class Result
{
    public List<String> smartNumber(int n, List<Integer> k)
    {
        List<String> returnSmartNumberYesNo = new ArrayList<>();
        boolean is_smart_number = false;
        int count_for_smart_number = 0;
        
            for(int i = 0; i < k.size(); i++)
            {
                for(int j = 1; j < k.get(i); j++)
                {
                    if(k.get(i)%j == 0)
                    {
                        count_for_smart_number = count_for_smart_number + 1;
                    }
                }

                if(count_for_smart_number%2 == 0)
                {
                    returnSmartNumberYesNo.add("YES");
                    count_for_smart_number = 0;
                }
                else{
                    returnSmartNumberYesNo.add("NO");
                    count_for_smart_number = 0;
                }
            }
        
            return returnSmartNumberYesNo;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Result r = new Result();
        List<Integer> k = new ArrayList<>();
        k.add(1);k.add(2);k.add(7);k.add(169);
        List<String> returnSmartNumberYesNo = r.smartNumber(4, k);
        
    }
}
