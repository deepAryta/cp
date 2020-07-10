/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class TheatreSqaure
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        long b=0;
        if(n<=a){
            b=1;
        }
        else{
            if(n%a==0){
                b=(long)n/a;
            }
            else{
                b=(long)n/a;
                b=b+1;
            }
        }
        // System.out.print(b);
        // m=m-a;
        long res=b;
        // if(m>0){    
        //     if(m<=a){
        //         res=res+b;
        //     }
        //     else{
        //         if(m%a==0){
        //             long div =(long) m/a;
        //             res=res*div;
        //         }
        //         else{
        //             long div=(long) m/a;
        //             div=div+1;
        //             res=res*div;
        //         }
        //     }
            
        // }
        // else{
        //     res=res;
        // }
        long div = m/a;
        if(m%a!=0){
            div=div+1;
        }
        res=res*div;
        System.out.print(res);
        
	}
}
