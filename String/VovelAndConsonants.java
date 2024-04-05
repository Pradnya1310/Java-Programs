package String;

import java.util.Scanner;

public class VovelAndConsonants {
	public static void main(String[] args, Scanner scanner) {
		int vowels=0;
		int consonants=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input=scanner.nextLine().toLowerCase();
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowels++;
				}else {
					consonants++;
				}
			}
		}
		System.out.println("Number of vowles: "+ vowels);
		System.out.println("Number of consonants: "+ consonants);
		
		
	}

}

