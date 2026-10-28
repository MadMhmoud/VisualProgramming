package edu.zuj.vp.homework2;

import java.util.Scanner;

public class RevertTriangleStar {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Stars Number : ");
        int num = scan.nextInt();
        
        
        for (int i = num; i >= 0; i--) {
           
            for (int j = i; j >= 1; j--) {
                
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    
}
