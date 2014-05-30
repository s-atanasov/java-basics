import java.util.Scanner;


public class _05_CountAllWords {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		scan.close();
		
		String[] count = input.split("[^\\w]+");
		System.out.println(count.length);
	}

}
