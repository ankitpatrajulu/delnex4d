import java.util.*;

public class Reverse{
	public static void main(String[] a){
		System.out.print("Enter input String: ");
		String in;
		Scanner sc = new Scanner(System.in);
		in = sc.nextLine();
		String rev = new StringBuilder(in).reverse().toString();
		System.out.print(rev);
		int i = 0;
		int vow = 0;
		int sp = 0;
		int con = 0;
		
		while(i<rev.length()){
			char c = rev.charAt(i);
			if(c=='a' ||c=='e' ||c=='i' || c=='o' ||c=='u' ||c=='A' ||
			c=='E' ||c=='I' ||c=='O' || c=='U'){
				vow++;
			}else if(c==' '){
				sp++;
			}else if(((int)c>=65 && (int)c<=90) || ((int)c>=97 && (int)c<=122)){
							con++;
						}
			i++;
		}
		System.out.print(" , the given string contains "+vow+" vowels and "+con+" consonants");
	}
}