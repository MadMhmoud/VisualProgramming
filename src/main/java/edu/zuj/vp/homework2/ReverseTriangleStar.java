package edu.zuj.vp.homework2;

import java.util.Scanner;

public class ReverseTriangleStar {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Stars Number : ");
        int num = scan.nextInt();
        
        for (int i = 0; i <= num; i++) {
            int starCount = num - i;
            
            for (int j = 0; j < num - starCount; j++) {
                System.out.print(" ");
            }
            System.out.println("*".repeat(starCount));
        }
        
    }
    
}
