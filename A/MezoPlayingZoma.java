import java.util.*;

public class diva {

	public static void main(String args[]){
		Scanner in =new  Scanner(System.in);
		int t=in.nextInt();
		int i;
		in.nextLine();
		String s = in.nextLine();
//		System.out.println(s+" "+t);
		int cl=0,cr=0;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i)=='L') {
				cl++;
			}else {
				cr++;
			}
		}
		System.out.println(cl+cr+1);
//		for(i=0;i<3*t;i++) {
//			int n = in.nextInt();
//			int m = in.nextInt();
//			Vector a = new Vector();
//			Vector b = new Vector();
//			int j;
//			int l = n;
//			if(l<m) l=m;
//			for(j=0;j<l;j++) {
//				if(j>=n) {
//				a.add(0);
//				}
//				else {
//					int num =in.nextInt();
//					a.add(num);
//				}
//			}
//			for(j=0;j<l;j++) {
//				if(j>=m) {
//					b.add(0);
//				}
//				else {
//					int num =in.nextInt();
//					b.add(num);
//				}
//			}
////			System.out.println("GOO");
//			int dn = 0;
//			for(j=0;j<l;j++){
////				System.out.println("I am here");
//				if(b.contains(a.get(j))) {
//					System.out.println("YES");
//					System.out.println(1+" "+a.get(j));
//					dn=1;
//					break;
//				}
//			
//			}
//			if(dn==0) {
//				System.out.println("NO");
//			}
//			
//			
//		}
	}

}
