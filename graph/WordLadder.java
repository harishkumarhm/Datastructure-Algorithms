package graph;

import java.util.*;

/*
Given a dictionary, and two words ‘start’ and ‘target’ (both of same length). Find length of the smallest chain from ‘start’ to ‘target’ if it exists, such that adjacent words in the chain only differ by one character and each word in the chain is a valid word i.e., it exists in the dictionary. It may be assumed that the ‘target’ word exists in dictionary and length of all dictionary words is same.
Example:

Input: Dictionary = {POON, PLEE, SAME, POIE, PLEA, PLIE, POIN}
       start = TOON
       target = PLEA
Output: 7
TOON - POON - POIN - POIE - PLIE - PLEE - PLEA

Input: Dictionary = {ABCD, EBAD, EBCD, XYZA}
       Start = ABCV
       End = EBAD
Output: 4
ABCV - ABCD - EBCD - EBAD
 */

public class WordLadder {

    private static Set<String> dictionary = new HashSet<>();

    public static List<String> findShortestPathBetweenWords(String source, String target, Set<String> dictionary)
    {
        if(!dictionary.contains(target))
            return new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(source);
        List<String> list = new ArrayList<>();
        while(!queue.isEmpty()) {

                char[] word = queue.peek().toCharArray();
                queue.remove();


                for (int i = 0; i < word.length; i++) {
                    char original = word[i];
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        word[i] = ch;
                        if (dictionary.contains(String.valueOf(word))) {
                            queue.add(String.valueOf(word));
                            dictionary.remove(String.valueOf(word));
                            list.add(String.valueOf(word));
                        }
                        if (target.equals(String.valueOf(word))) {
                         //   list.add(String.valueOf(word));
                            return list;
                        }
                    }
                    word[i] = original;
                }

            }

        return list;
    }

    public static void main (String[] args)
    {
        Set<String> dictionary = new HashSet<>(Arrays.asList(new String[]{"poon", "plee", "same", "poie", "plea", "plie", "poin"}));
        List<String>list = findShortestPathBetweenWords("toon","plea",dictionary);
        for(String str: list)
            System.out.println(str);
    }
}
