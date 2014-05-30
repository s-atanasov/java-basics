import java.util.Scanner;


public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		String word = scan.nextLine();
		
		scan.close();
		
		String[] words = input.split("[^\\w]+");
		
		int count = 0;
		
		for(int i=0;i<words.length;i++){
			if(words[i].toLowerCase().equals(word.toLowerCase())){
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
