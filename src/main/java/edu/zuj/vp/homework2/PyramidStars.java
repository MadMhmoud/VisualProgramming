package edu.zuj.vp.homework2;

import java.util.Scanner;

public class PyramidStars {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Stars Number : ");
        int num = scan.nextInt();
        
        int currentStar = 0;
        
        
        if(num % 2 == 0) {
            
            currentStar = 2;
        } else {
            
            currentStar = 1;
        }
        
        while(currentStar <= num) {
            
            int sideSpace = (num - currentStar)/2;
            
            System.out.print(" ".repeat(sideSpace));
            System.out.println("*".repeat(currentStar));
            
            currentStar += 2;
        }
        
        
       
        
    }
    
}
