import java.util.Scanner;

public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine().toLowerCase();
		
		String word = scan.nextLine().toLowerCase();
		
		scan.close();
		
		int count = 0;
		int index = 0;
		
		while ((index = input.indexOf(word, index)) != -1) {
			count++;
			index += 1;
		}
		
	    System.out.println(count);

	}

}
