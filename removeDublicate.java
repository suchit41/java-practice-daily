import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDublicate {
    	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
	   String fs = removedublicate(s);
	   System.out.println(fs);
	   
	}
	
	
	public static String removedublicate(String s){
	    Set <Character> set = new HashSet<>();
	    StringBuffer strbuffer = new StringBuffer();
	    
	    for (int i=0;i<s.length();i++){
	        Character c = s.charAt(i);
	        if(!set.contains(c)){
	            set.add(c);
	            strbuffer.append(c);
	            
	        }
	    } 
	    return strbuffer.toString();
	    }
}

    

