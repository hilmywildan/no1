/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naru;

/**
 *
 * @author Praktikum
 */
import java.util.Scanner;
public class Naru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0, b=1, hasil=1, c;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Deret FIBO : ");
        c=input.nextInt ();
        for (int i=1; i<=c; i++)
            a=b;
            b=hasil;
            System.out.println(hasil+"");
            hasil=a+b;
    }
    

}
