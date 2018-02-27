package Kap11Exercise15;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Opgave15
{
    /*
    Write a method maxOccurrences that accepts a list of integers as a parameter
    and returns the number of times the most frequently occurring integer (the “mode”)
    occurs in the list. Solve this problem using a map as auxiliary storage.
    If the list is empty, return 0.
    */

    public static void main(String[] args)
    {
        List<Integer> theList = new LinkedList<>();
        theList.add(1);
        theList.add(2);
        theList.add(2);
        theList.add(2);
        theList.add(3);
        theList.add(4);
        theList.add(5);
        theList.add(6);
        theList.add(7);
        theList.add(7);

        System.out.println(maxOccurrences(theList));
    }

    public static Integer maxOccurrences(List<Integer> integerList)
    {
        Map<Integer, Integer> occurenceList = new HashMap<Integer, Integer>();
        Integer occurencesTimes = 0;

        for (Integer countWords : integerList)
        {
            if (occurenceList.containsKey(countWords.intValue()))
            {
                occurenceList.put(countWords.intValue(), occurenceList.get(countWords.intValue()) + 1);
            }
            else
            {
                occurenceList.put(countWords.intValue(), 1);
            }
        }

        for (int times : occurenceList.values())
        {
            if (times > occurencesTimes)
            {
                occurencesTimes = times;
            }
        }


        return occurencesTimes;
    }

}
