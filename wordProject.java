package wordProject;
import java.util.Scanner;

public class WordProject {
	
	public class Word {
		String word;
	
	public Word(String word) {
		this.word = word;

	}
	
	public void getWord() {
		System.out.println("The inputted word is: " + word );
	}
	
	public void getFirstLetter() {
		String firstLetter = word.substring(0,1);
		System.out.println("The first letter of " + word + " is: " + firstLetter);
	}
	
	public void getLastLetter() {
		String lastLetter = word.substring(word.length() - 1 ); // This will effectively take the length of the word and subtract by 1 to only keep the last letter.
		System.out.println("The last letter of " + word + " is: " + lastLetter);

	}
	
	public void removeFirstLetter() {
		String noFirstLetter = word.substring(1);
		System.out.println("The word without the first letter of is: " + noFirstLetter);

	}
	
	public void removeLastLetter() {
		String noLastLetter = word.substring(0, word.length() - 1);
		System.out.println("The word without the first letter of is: " + noLastLetter);
	}
	
	public void findLetter(String stringToFind) {
		int position = word.indexOf(stringToFind);
		position = position + 1; // So it's accurate for counting
		if (position != 0) {		
		System.out.println("The letter " + stringToFind + " can be found at position " + position + " of the word.");
		} else {
			System.out.print("That letter is not apart of the word you've provided.");
		}
	}
}

	public static void main(String[] args) {
		WordProject word1 = new WordProject();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type out a word, see different information about it!");
		String text = scanner.nextLine();
		
		Word word = word1.new Word(text);

		word.getWord();
		word.getFirstLetter();
		word.getLastLetter();
		word.removeFirstLetter();
		word.removeLastLetter();
		
		System.out.println("\n\nEnter the letter you wish to find!");
		String stringToFind = scanner.nextLine();
		word.findLetter(stringToFind);	
	}


}