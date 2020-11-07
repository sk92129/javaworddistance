package com.seankang;

/* This class will be given a list of words (such as might be tokenized
 * from a paragraph of text), and will provide a method that takes two
 * words and returns the shortest distance (in words) between those two
 * words in the provided text.
 * Example:
 *   WordDistanceFinder finder = new WordDistanceFinder(Arrays.asList("the", "quick", "brown", "fox", "quick"));
 *   assert(finder.distance("fox", "the") == 3);
 *   assert(finder.distance("quick", "fox") == 1);
 *
 * "quick" appears twice in the input. There are two possible distance values for "quick" and "fox":
 *     (3 - 1) = 2 and (4 - 3) = 1.
 * Since we have to return the shortest distance between the two words we return 1.
 */


import java.util.ArrayList;
import java.util.List;

public class WordDistanceFinder {

    private List<String> mywords;
    public WordDistanceFinder(List<String> words) {
        mywords = words;
    }

    // the = list(0)
    // quick  = list<1 4>

    public int distance(String word1, String word2) {

        if (word1.equals(word2))
            return 0;
        ArrayList<Integer> word1Index = new ArrayList<Integer>(); // 0
        ArrayList<Integer> word2Index = new ArrayList<Integer>(); // 1 4

        int index = 0;
        for (String word: mywords) {
            if (word.equals(word1)){
                word1Index.add(index);
            }
            if (word.equals(word2)){
                word2Index.add(index);
            }
            index++;
        }
    int difference =Integer.MAX_VALUE;
      if (word1Index.size() == 0 || word2Index.size() == 0)
              return -1;
      for (int i = 0; i< word1Index.size(); i++) {
        int valuei = word1Index.get(i);
        for (int j= 0; j < word2Index.size() ; j++){
            int diff;
            int valuej = word2Index.get(j);
            if (valuej > valuei)
                diff = valuej - valuei ;
            else
                diff = valuei - valuej ;
            if (diff < difference)
                difference = diff;
        }
    }

      return difference;
    }
}
