package org.example;

class VowelCounterLogic extends VowelCounter {
    int countVowel(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}