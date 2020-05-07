import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
//		int d,m,n;
//		d=in.nextInt();
//		m=in.nextInt();
//		n=in.nextInt();
//		int[] a = new int[3000];
//		int i;
//		for(i=0;i<n;i++)
//			a[i]=in.nextInt();
//		int run=1,curp=0,ref=0,lasp=0;
//		while(curp<=n) {
//			lasp=curp;
//			while(curp<=n&&(a[curp+1]-a[lasp]<=m)) {
//				curp++;
//			}
//			if(curp==lasp) {
//				System.out.println(-1);
//				curp=n+2;
//				run=0;
//			}
//			else {
//				ref++;
//			}
//			
//		}
//		if(run==1)
//		System.out.println(ref);
		
		int n =in.nextInt();
		int[] a = new int[200000];
		int i;
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		int s=a[0];
		int l = a[0];
		for(i=0;i<n;i++) {
			if(a[i]<s) {
				s=a[i];
			}
		}
		for(i=0;i<n;i++) {
			if(a[i]>l) {
				l=a[i];
			}
		}
		int dif = l-s;
		int cs=0,cl=0;
		for(i=0;i<n;i++) {
			if(a[i]==s)
				cs++;
			if(a[i]==l)
				cl++;
		}
		long count=0;
		if(s==l) {
			count=1;
			long ln=n;
			count=(ln*(ln-1))/2;
		}
		else {
			long lcl=cl;
			long lcs=cs;
			count=lcl*lcs;
		}
		
		
		System.out.println(dif+" "+count);
		

	}
}
