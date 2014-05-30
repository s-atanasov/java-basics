import java.util.ArrayList;
import java.util.Scanner;


public class _04_LongestIncreasingSequence {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] input_str = scan.nextLine().split(" ");
		
		scan.close();
		
		int[] input_int = new int[input_str.length];
		
		for(int i = 0; i < input_str.length; i++){
			input_int[i] = Integer.parseInt(input_str[i]);
		}
		
		ArrayList<Integer> list_temp = new ArrayList<Integer>();
		ArrayList<Integer> list_int = new ArrayList<Integer>();

		for(int i = 0; i < input_int.length - 1; i++){
			
			if(input_int[i] < input_int[i+1]){
				
				System.out.print(input_int[i]);
				System.out.print(" ");
				
				list_temp.add(input_int[i]);
				
				if ((i+1) == (input_int.length-1)){
					
					System.out.print(input_int[i+1]);
					System.out.print(" ");
					
					list_temp.add(input_int[i+1]);
					
					if(list_temp.size() > list_int.size()){
						
						list_int = (ArrayList<Integer>) list_temp.clone();
					}
					
					list_temp.clear();
				}

			}else{
				
				System.out.print(input_int[i]);
				System.out.print(" ");
				System.out.println();
				
				list_temp.add(input_int[i]);
				
				if ((i+1) == (input_int.length-1)){
					
					System.out.print(input_int[i+1]);
					System.out.print(" ");
					
				}
				
				if(list_temp.size() > list_int.size()){
					
					list_int = (ArrayList<Integer>) list_temp.clone();
				}
				
				list_temp.clear();
			}
			
		}
		
		System.out.println();
		System.out.print("Longest: ");
		
		for(int i = 0; i < list_int.size(); i++){
			System.out.print(list_int.get(i));
			System.out.print(" ");
		}
		
	}

}
