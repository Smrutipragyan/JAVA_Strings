import java.util.*;
public class Pallindrome_or_Not {

	public static boolean Pallindrome(String str)
	{
		for(int i=0;i<str.length()/2;i++) {
			int n=str.length();
			if(str.charAt(i)!=str.charAt(n-1-i))
			{
				return false;
				 
			}
	}
		 return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.next();
		 System.out.println(Pallindrome(str));
		 
		}
	}
	

 
