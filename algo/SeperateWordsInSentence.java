package algo;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SeperateWordsInSentence {
	public static void main(String[] args) {
		String[] dictionary = {"the", "a", "i", "here", "so", "hid", "there",
				"are", "some", "word", "words", "hid", "hi", "hidden", "he",
				"here", "her", "rear", "me", "den"};
		String sentence = "therearesomewordshiddenhere";
		String[] wordsArr = null;
		Stack<String> words = new Stack<String>();
		Set<String> dictionarySet = new HashSet<String>();
		for (String word : dictionary)
			dictionarySet.add(word);
		if (isSeparateWord(dictionarySet, sentence, 0, words))
			wordsArr =  words.toArray(new String[] {});
		for (String word1 : wordsArr)
			System.out.println(word1 + " ");
	}

	public static boolean isSeparateWord(Set<String> dictionary,
			String sentence, int startIndex, Stack<String> words) {
		boolean isWord = false;
		if (startIndex == sentence.length())
			return true;
		for (int i = startIndex + 1; i <= sentence.length(); i++) {

			String foundWord = sentence.substring(startIndex, i);
			if (dictionary.contains(foundWord)) {
				words.push(foundWord);
				if (isSeparateWord(dictionary, sentence, i, words)) {
					isWord = true;
					break;
				}
				words.pop();
			}
		}
		
		return isWord;
	}
}
