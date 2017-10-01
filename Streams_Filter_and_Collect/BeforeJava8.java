package com.ankit.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {
    
    public static void main(String[] args) {
        
        List<String> lines = Arrays.asList("Java", "Android", "Swift", "iOS");
        List<String> result = getFilterOutput(lines, "iOS");
        for (String temp: result) {
            System.out.println(temp);
        }
    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!filter.equals(line)) {
                result.add(line);
            }
        }
        return result;
    }

}