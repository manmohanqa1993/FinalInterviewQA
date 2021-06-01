package STRING_FINAL;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String name = sc.nextLine();
		
		char ch[] = name.toCharArray();
		String revstring = "";
		
		for(int i =ch.length-1;i>=0 ;i--) {
			
			revstring = revstring+ ch[i];
		}
		
		System.out.println("Reverse Strig "+ revstring);
		
		
	}

}
