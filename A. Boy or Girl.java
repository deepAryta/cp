/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
	Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	    // distinct number of letters then men 
	    int[] a = new int[26];
	    int i;
	    for(i=0;i<s.length();i++){
	        char c = s.charAt(i);
	        int n = c-97;
	        a[n]++;
	    }
	    int co=0;
	    for(i=0;i<26;i++){
	    if(a[i]!=0)
	        co++;
	    }
	    if(co%2==0) System.out.print("CHAT WITH HER!");
	    
	    else System.out.print("IGNORE HIM");
	    
	    
	    
	    
	}
}
