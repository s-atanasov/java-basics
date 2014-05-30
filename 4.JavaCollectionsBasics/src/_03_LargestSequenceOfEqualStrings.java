import java.util.ArrayList;
import java.util.Scanner;


public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] input = scan.nextLine().split(" ");
		
		scan.close();
		
		ArrayList<String> list_str = new ArrayList<String>();
		
		for(int i = 0; i < input.length; i++){
			if(!list_str.contains(input[i])){
				list_str.add(input[i]);
			}
		}
		
		int[] count_ar = new int[list_str.size()];
		
		
		for(int i = 0; i < count_ar.length; i++){
			for(int j=0; j < input.length; j++){
				
				if( list_str.get(i).contains(input[j]) ){
					count_ar[i] +=1;
				}
			}
		}
		
		int max = 0;
		
		for(int i=0;i<count_ar.length;i++){
			if (count_ar[max] < count_ar[i]){
				max = i;
			}
		}
		
		for(int i=0;i<count_ar[max];i++){
			System.out.print(list_str.get(max));
			System.out.print(" ");
		}

	}

}
