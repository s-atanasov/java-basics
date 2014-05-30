import java.util.ArrayList;
import java.util.Scanner;


public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String inputList1 = scan.nextLine();
		
		String inputList2 = scan.nextLine();
		
		scan.close();
		
		ArrayList<Character> list1 = new ArrayList<Character>();
		
		ArrayList<Character> listTemp = new ArrayList<Character>();
		
		for(int i=0;i<inputList1.length();i++){
			if (inputList1.charAt(i) != ' '){
				list1.add(inputList1.charAt(i));
			}
		}
		
		ArrayList<Character> list2 = new ArrayList<Character>();
		
		for(int i=0;i<inputList2.length();i++){
			if (inputList2.charAt(i) != ' '){
				list2.add(inputList2.charAt(i));
			}
		}
		
		for(int i=0;i<list2.size();i++){
			if (!list1.contains(list2.get(i))){
				listTemp.add(list2.get(i));
			}
		}
		
		list1.addAll(listTemp);
		
		for(int i=0;i<list1.size();i++){
			System.out.print(list1.get(i));
			System.out.print(" ");
		}
		
	}

}
