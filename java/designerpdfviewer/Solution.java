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
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
    int max_value = 0;
        Hashtable<Character, Integer> ht = new Hashtable<>();
        ht.put('a', 0);ht.put('b', 1);ht.put('c',2);ht.put('d', 3);ht.put('e', 4);ht.put('f',5);
        ht.put('g', 6);ht.put('h', 7);ht.put('i',8);ht.put('j', 9);ht.put('k', 10);ht.put('l',11);
        ht.put('m', 12);ht.put('n', 13);ht.put('o',14);ht.put('p', 15);ht.put('q', 16);ht.put('r',17);
        ht.put('s', 18);ht.put('t', 19);ht.put('u',20);ht.put('v', 21);ht.put('w', 22);ht.put('x',23);
        ht.put('y', 24);ht.put('z', 25);
    
        for(int i = 0; i < word.length(); i++)
        {   
            if(h.get(ht.get(word.charAt(i))) > max_value)
            {
                max_value = h.get(ht.get(word.charAt(i)));
            }
        }
        return max_value*word.length();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String word = bufferedReader.readLine();

        int result = Result.designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
