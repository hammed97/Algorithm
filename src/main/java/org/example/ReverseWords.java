package org.example;
//Write a function reverse_words(s) that reverses the order of words in a
//non-null (but possibly empty) string s. A word is defined as a series
//of characters bordered by space characters and/or the start or end of
//the string on either side. Punctuation is considered part of a word as
//a non-space character.
public class ReverseWords {
    public static String reverseWords(String s){
        String[] words = s.split("");
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length -1; i >= 0; i--){
            reversedString.append(words[i]).append("");
        }
        return reversedString.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }


}
