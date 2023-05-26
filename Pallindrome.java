import java.util.*;
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string-");
		String str=sc.next();
		//String str="S M R U T I";
		StringBuilder str2=new StringBuilder(str);
		str2.reverse();
		System.out.println(str2);
		
		 
		
	}

}
