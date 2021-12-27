/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Q3_BCNN {
    final static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public int UCLN(int a, int b){
        if(a==b) return a;
        if(a>b) return UCLN(a-b,b);
        else return UCLN(a,b-a);
    }
    int BCNN(int a, int b){
        return (a*b/UCLN(a, b));
                }
   public int BCNN_M(int a[]){
        int tmp =0;
        if(a[0] > a[1]){
             tmp = BCNN(a[1],a[1]+1);
            for(int i=a[1]+2; i<=a[0]; i++){
                tmp =BCNN(tmp,i);
        }
        }
        if(a[0] < a[1]){
             tmp = BCNN(a[0],a[0]+1);
            for(int i=a[0]+2; i<=a[1]; i++){
                tmp =BCNN(tmp,i);
        }
        }
         return tmp;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = new int [2]; 
        System.out.print("a[0]: ");
        a[0] = sc.nextInt();
        System.out.print("a[1]: ");
        a[1] = sc.nextInt();
        Q3_BCNN main = new Q3_BCNN();
        int bcnn = main.BCNN_M(a);
        System.out.println("BCNN :  " +bcnn);
    }
    
}
