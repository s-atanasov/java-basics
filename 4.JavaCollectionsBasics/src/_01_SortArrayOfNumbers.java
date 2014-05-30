import java.util.Arrays;
import java.util.Scanner;


public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = Integer.parseInt(scan.nextLine());
		
		String[] arrays_str = scan.nextLine().split(" ");
		
		int[] array_int = new int[count];
		
		scan.close();
		
		for(int i = 0; i < arrays_str.length;i++){
			array_int[i] = Integer.parseInt(arrays_str[i]);
		}
		
		Arrays.sort(array_int);
		
		for(int i = 0; i < array_int.length;i++){
			System.out.print(array_int[i]);
			System.out.print(" ");
		}
		
	}

}
