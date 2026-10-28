package edu.zuj.vp.homework2;

import java.util.Scanner;

public class HoriStars {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Stars Number : ");
        int num = scan.nextInt();
        
        for (int i = 0; i < num; i++) {
            
            System.out.print("*");
            
        }
        
    }
    
}
