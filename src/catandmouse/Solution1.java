package catandmouse;

import java.util.*;
import java.math.*;

public class Solution1 {
	public static String catAndMouse(int x, int y, int z)
	{
		int a=x-y;
		int b=x-z;
		if(Math.abs(a)<z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of queries you want to check");
		int q=sc.nextInt();
		System.out.println("enter cat A position");
		int a=sc.nextInt();
		System.out.println("enter cat B position");
		int b=sc.nextInt();
		System.out.println("enter mouse C position");
		int c=sc.nextInt();
		String s=catAndMouse(a,b,c);
		}
		

	}

}
