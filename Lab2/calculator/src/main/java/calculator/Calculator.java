/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

//import javax.xml.transform.OutputKeys;

public class Calculator {
    public static void main(String[] args)
    {
        int number1 , number2;
        if(args.length == 3){
        number1 = Integer.parseInt(args[0]);
        number2 = Integer.parseInt(args[2]);
        String result ;
        char operator = args[1].charAt(0);
        
        switch(operator)
        {
            case '+':
                result = String.valueOf(number1+number2);
                System.out.println(result);
            break;
            case '-':
                result = String.valueOf(number1-number2);
                System.out.println(result);
            break;
            case 'x':
               result = String.valueOf(number1*number2);
                System.out.println("result "+result);
            break;
            case '/':
                result = String.valueOf(number1/number2);
                System.out.println(result);
            break;
            default:
                System.out.println("invalid operator");
        }
        }
        
    }
}
