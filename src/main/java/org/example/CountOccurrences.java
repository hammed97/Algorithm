package org.example;

public class CountOccurrences {
    public static int countOccurrences(String s, String sub){
        int count = 0;
        int idx = 0;
        while ((idx = s.indexOf(sub, idx)) != -1){
            idx += sub.length();
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrences("banana", "na"));
    }
}
