package marsexploration;

import java.util.*;

public class Solution {
	public static int marsExploration(String s)
	{
		int n=s.length();
		for (int i = 0; i < n; i++) {
			
		
		if(s.charAt(i)=='s')
		{
			
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of times u want to send message");
		int n=sc.nextInt();
		String s[]=new String[n];
		for (int i = 0; i < s.length; i++) {
			s[i]=sc.next();
			
		}
		int a=marsExploration(s.toString());

	}

}
