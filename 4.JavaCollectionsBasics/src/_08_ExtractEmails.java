import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _08_ExtractEmails {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine().toLowerCase();
		
		scan.close();
		
		ArrayList<String> emails = new ArrayList<String>();
		
		String RE_MAIL = "([\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Za-z]{2,4})";
	    Pattern p = Pattern.compile(RE_MAIL);
	    Matcher m = p.matcher(input);

	    while(m.find()) {
	    	if(!emails.contains(m.group(1))){
	    		emails.add(m.group(1));
	    	}
	    }
	    
	    for(int i=0;i<emails.size();i++){
	    	System.out.println(emails.get(i));
	    }

	}

}
