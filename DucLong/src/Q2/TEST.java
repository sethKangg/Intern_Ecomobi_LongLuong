/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heres
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Input : ");

        int n = sc.nextInt();
        int i = 1;
        System.out.println("Odd number: ");
        boolean flag = true;
        while (flag == true) {
            int fi = fibo(i);
            if (sum + fi > n) {
                    flag = false;
                }
            if ((fi % 2 == 1)) {
                System.out.print(fibo(i) + " ");
                sum += fibo(i);
            }
            i++;
        }
        System.out.println("");
        System.out.println("SUM: " + sum);
    }

    public static int fibo(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

}
