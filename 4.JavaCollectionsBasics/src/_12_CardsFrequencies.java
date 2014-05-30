import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _12_CardsFrequencies {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] inputText = scan.nextLine().split(" ");
		
		scan.close();
		
		Map<String , Integer> dictionary = new HashMap<String, Integer >();
		
		String face = "";
		
		for(int i = 0; i < inputText.length; i++){
			
			face = inputText[i].replace(inputText[i].substring(inputText[i].length()-1), "");

			if(dictionary.containsKey(face)){
				dictionary.put(face, dictionary.get(face) + 1);
			}else{
				dictionary.put(face,1);
			}
			
		}
		
		ArrayList<String> used = new ArrayList<String>();
		
		for(int i = 0; i < inputText.length; i++){
			
			face = inputText[i].replace(inputText[i].substring(inputText[i].length()-1), "");
			
			if(!used.contains(face)){
				System.out.format("%s -> %.2f %% \n", face,(double)dictionary.get(face) / inputText.length * 100);
				used.add(face);
			}
			
		}
		
	}

}
