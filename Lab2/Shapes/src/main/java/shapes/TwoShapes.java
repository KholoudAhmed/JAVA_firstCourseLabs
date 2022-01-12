/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

public class TwoShapes {
    public static void main(String[] args)
    {
        
        for(int i = 0 ; i< 6 ; i++)
        {
            for(int j=0 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
     
     int holes = 5;
     for (int i = 0; i < 6; i++) {
       for (int j = 0; j < holes; j++) {
         System.out.print(" ");
       }
       holes--;
       for (int j = 0; j <= 2 * i - 1; j++) {
         System.out.print("*");
       }
       System.out.println("");
     }
    }
    
}
