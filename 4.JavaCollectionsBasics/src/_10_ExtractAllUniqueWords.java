import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String inputText = scan.nextLine();
		
		scan.close();
		
		ArrayList<String> uniqueWords = new ArrayList<String>();
		
		inputText = inputText.toLowerCase();
		
		String[] words = inputText.split("[^\\w]+");
		
		for(int i=0; i<words.length; i++){
			if(!uniqueWords.contains(words[i])){
				uniqueWords.add(words[i]);
			}
		}
		
		Collections.sort(uniqueWords);
		
		for(int i=0; i<uniqueWords.size(); i++){
			System.out.print(uniqueWords.get(i));
			System.out.print(" ");
		}
		
	}

}
