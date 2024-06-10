package easy.sorting_the_sentence;

class Solution {
    public String sortSentence(String s) {
        // Split the sentence ito words
        String[] words = s.split(" ");

        // Create an array to hold the sorted words
        String[] sortedWords = new String[words.length];

        // Iterate over each word to extract its position and place it in the correct position
        for (String word : words) {
            // The position is the last character of the word
            int position = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;

            // Place the word without the position number into the sorted array
            sortedWords[position] = word.substring(0, word.length() - 1);
        }

        // Join the sorted words to form the original sentence
        return String.join(" ", sortedWords);
    }
}

