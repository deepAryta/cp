
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
	
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] a = new int[200000];
	int l1 = 0,indexofl1=-1;
	int i,l2 = 0;
	for(i=0;i<n;i++){
	    a[i]=in.nextInt();
	    if(l1<a[i]){
	        l1=a[i];
	        indexofl1=i;
	    }
	}
	for(i=0;i<n;i++){
	    if(indexofl1!=i&&l2<a[i]){
	        l2=a[i];
	    }
	}
	long ll1 = (long) l1;
	long ll2 = (long) l2;
	long  res = ll1*ll2;
	System.out.println(res);
	
	    
	    
	}
}
