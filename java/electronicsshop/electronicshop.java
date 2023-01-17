//https://www.hackerrank.com/challenges/electronics-shop/problem?isFullScreen=true

package electronicsshop;

import java.util.Collections;
import java.util.List;

public class electronicshop {
    
    public static void electronicsshop(Integer budget, List<Integer> keyboards, List<Integer> drives)
    {
        Integer largest_closetobudget = -1;
        for(Integer i = 0; i < keyboards.size(); i++)
        {
            for(Integer j = 0; j < keyboards.size(); j++)
            {
                if(keyboards.get(i) + drives.get(j) < budget)
                {
                    if(keyboards.get(i) + drives.get(j) > largest_closetobudget)
                    {
                        largest_closetobudget = keyboards.get(i) + drives.get(j);
                    }
                }
            }
        }
        System.out.println("max budget cost" + largest_closetobudget);
        
    }


    public static int electronicsshop1(int[] drives, int[] keyboards, int b)
    {
        int max_value = -1;
         int max_keyboard_value = keyboards[0];
         int max_drives_value = drives[0];
         List<Integer> values = new ArrayList<Integer>();
         for(int i = 0; i < keyboards.length; i++)
         {
             for(int j = 0; j < drives.length; j++)
             {
                 if (keyboards[i] + drives[j] <= b)
                 {
                    values.add(keyboards[i] + drives[j]);
                 }
             }
         }
         System.out.println(values);
         Collections.sort(values, Collections.reverseOrder());
         if(values.size() != 0)
         {
             max_value = values.get(0);
            return max_value;
         }else{
             return -1;
         }
    }
}

