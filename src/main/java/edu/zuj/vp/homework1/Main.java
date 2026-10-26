package edu.zuj.vp.homework1;

import javax.swing.JOptionPane;

public class Main {
    
    static double number = 0;
    
    public static void main(String[] args) {
        
        String strNum = JOptionPane.showInputDialog("Enter Unit Value : ");
        number = Double.parseDouble(strNum);
        
        
        StringBuffer buffer = new StringBuffer();
        buffer.append("Choose Conversion Method : \n ");
        buffer.append("1 - CM to Inch \n ");
        buffer.append("2 - Inch to CM \n ");
        buffer.append("3 - Feet to Meter \n ");
        buffer.append("4 - Meter to Feet \n ");
        buffer.append("5 - Dunm to Hiktar \n ");
        buffer.append("6 - Hiktar to Dunm \n ");
        buffer.append("7 - Fenh to Cels \n ");
        buffer.append("8 - Cels to Fenh \n ");
        
        
        String srtUnit = JOptionPane.showInputDialog(buffer.toString());
        int unit = Integer.parseInt(srtUnit); 
        
        switch (unit) {
            
            case 1: JOptionPane.showMessageDialog(null,"Unit is " + number / 2.54); break;
            case 2: JOptionPane.showMessageDialog(null,"Unit is " + number * 2.54); break;
            case 3: JOptionPane.showMessageDialog(null,"Unit is " + number / 3.281); break;
            case 4: JOptionPane.showMessageDialog(null,"Unit is " + number * 3.281); break;
            case 5: JOptionPane.showMessageDialog(null,"Unit is " + number / 10); break;
            case 6: JOptionPane.showMessageDialog(null,"Unit is " + number * 10); break;
            case 7: JOptionPane.showMessageDialog(null,"Unit is " + number / 1.8); break;
            case 8: JOptionPane.showMessageDialog(null,"Unit is " + number * 1.8); break;
               
            default:
                JOptionPane.showMessageDialog(null, "Invalid Input.");
                System.exit(0);
        }
        
        System.exit(0);
        
    }
    
    
}
