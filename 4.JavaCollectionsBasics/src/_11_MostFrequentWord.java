import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class _11_MostFrequentWord {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String inputText = scan.nextLine();
		inputText = inputText.toLowerCase();
		
		String[] inputTextAr = inputText.split("[^\\w]+");
		
		scan.close();
		
		ArrayList<String> list_str = new ArrayList<String>();
		
		for(int i = 0; i < inputTextAr.length; i++){

			if(!list_str.contains(inputTextAr[i])){
				list_str.add(inputTextAr[i]);
			}
		}
		
		int[] count_ar = new int[list_str.size()];
		
		for(int i = 0; i < count_ar.length; i++){
			for(int j=0; j < inputTextAr.length; j++){
				
				if( list_str.get(i).equals(inputTextAr[j]) ){
					count_ar[i] +=1;
				}
			}
		}
		
		int max = 0;
		
		for(int i=0;i<count_ar.length;i++){
			if (max < count_ar[i]){
				max = count_ar[i];
			}
		}
		
		Map<String, Integer> dictionary = new HashMap<String, Integer>();
		
		for(int i=0;i<count_ar.length;i++){
			if(count_ar[i] == max){
				dictionary.put(list_str.get(i), count_ar[i]);
			}
		}
		
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(dictionary);
		
		for(String key : treeMap.keySet()){
			System.out.println(key + " -> " + treeMap.get(key) + " times");
		}
		

	}

}
