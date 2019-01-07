package com.qa.main;

import java.util.HashMap;
import java.util.Map;

public class Alphabet {
    private Map<Character, Integer> alphabetMapToIndex;


    public Alphabet() {
        alphabetMapToIndex = new HashMap<Character, Integer>();
        int counter = 1;
        for (Character letter = 'A'; letter <= 'Z'; ++letter) {
            alphabetMapToIndex.put(letter, counter);
            counter++;
        }
    }

    public String replaceLetterWithIndex(String input) {
        String result = "";
        char[] convertedInput = input.toUpperCase().toCharArray();

        for (int x = 0;x < convertedInput.length;x++) {

            for (Character item : getAlphabetMapToIndex().keySet()) {
                if (convertedInput[x] == item ) {
                    result += alphabetMapToIndex.get(item).toString() + " ";
                }
            }
        }
        return result.trim();
    }

    public Map<Character, Integer> getAlphabetMapToIndex() {
        return alphabetMapToIndex;
    }

    public void setAlphabetMapToIndex(Map<Character, Integer> alphabetMapToIndex) {
        this.alphabetMapToIndex = alphabetMapToIndex;
    }
}
