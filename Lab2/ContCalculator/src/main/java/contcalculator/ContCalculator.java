/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contcalculator;

public class ContCalculator {
    public static void main(String[] args)
    {
        String[] operArr = new String[args.length/2];
        int[] numberArr = new int[args.length/2 +1];
        int numCounter = 0 , counter = 0; 
        
        for(int i = 0 ; i< args.length ; i++)
        {
            if(i %2 == 0)
            {
                numberArr[numCounter] = Integer.parseInt(args[i]);
                numCounter++;
            }
            else
            {
                operArr[counter] = args[i];
                counter++;
            }
        }
        double result = numberArr[0];
        for(int j = 0 ; j < operArr.length ; j++)
        {
            switch(operArr[j])
            {
                case "+":
                    result = result + numberArr[j+1];
                    break;
                case "-":
                    result = result - numberArr[j+1];
                    break;
                case "x":
                    result = result * numberArr[j+1];
                    break;
                case "/":
                    result = result / numberArr[j+1];
                    break;
                default:
                    System.out.println("invalid operator");
            }
        }
        System.out.println(result);
        
    }
    
}
