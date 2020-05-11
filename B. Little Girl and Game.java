import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
    Scanner in =new Scanner(System.in);
    int[] a = new int[26];
    int i;
    String s = in.nextLine();
    int l = s.length();
    for(i=0;i<l;i++){
        char c= s.charAt(i);
        int n  = c-97;
        a[n]++;
    }
    int odd=0;
    for(i=0;i<26;i++){
        if(a[i]%2!=0)
        odd++;
    }
    
    if(odd<=1) System.out.println("First");
    
    else {
        if(odd%2==0) System.out.println("Second"); 
    
        else 
        System.out.println("First");
        
    }
    
    
	}
}
