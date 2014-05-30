import java.util.ArrayList;
import java.util.Scanner;


public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] input = scan.nextLine().split(" ");
		
		scan.close();
		
		ArrayList<Integer> list_int = new ArrayList<Integer>();
		
		
		for(int i = 0; i < input.length; i++){
			
			if(!list_int.contains(i)){
				for(int j=i+1; j < input.length; j++){
					
					if( input[i].equals(input[j]) ){
						System.out.print(input[j]);
						System.out.print(" ");
						list_int.add(j);
					}
				}
				
				System.out.print(input[i]);
				System.out.print(" ");
				
				System.out.println();
			}
			
			
		}
		
	}

}
