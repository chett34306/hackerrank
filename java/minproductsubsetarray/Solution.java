//https://www.geeksforgeeks.org/minimum-product-subset-array/?ref=lbp

package minproductsubsetarray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(-1);a.add(-1);a.add(-2);a.add(4);a.add(3);
        System.out.println(a);
        int minprod = minproductsubsetarray(a);
        System.out.println("Min prod is " + minprod);
    }

    public static int minproductsubsetarray(List<Integer> a)
    {
        int minprod = Integer.MAX_VALUE;
        for(int i = 0; i < a.size(); i++)
        {
            int tempprod = 1;
            for(int j = i; j < a.size(); j++)
            {
                tempprod = tempprod * a.get(j);
            }
            if(tempprod < minprod)
            {
                minprod = tempprod;
            }
            
        }
        return minprod;     
    }
}
