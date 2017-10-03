package com.ankit.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {
    
    public static void main(String[] args) {
        
        List<String> lines = Arrays.asList("Java", "Android", "Objective C", "Swift", "iOS");          // creates a list from these items
        List<String> result = getFilterOutput(lines, "Objective C");                                   // get filtered items
        for (String temp: result) {
            System.out.println(temp);                                                                  // prints filtered items
        }
    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {                                                 // iterating items
            if (!filter.equals(line)) {                                             // excluding item "Objective C" from list
                result.add(line);
            }
        }
        return result;                                                              // return filtered result
    }

}