package org.example;

import java.util.HashSet;
import java.util.Set;

//Write a function remove_duplicates(s) that removes consecutive
//duplicate words in a non-null (but possibly empty) string s. A word
//is defined as a series of characters bordered by space characters
//and/or the start or end of the string on either side. Punctuation is
//considered part of a word as a non-space character.
public class RemoveDuplicate {
    public static String removeDuplicates(String s) {
        String[] words = s.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (uniqueWords.add(word)) {
                // If the word is added to the set, it's unique
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("Java Java Programming is is fun fun"));
    }

}
