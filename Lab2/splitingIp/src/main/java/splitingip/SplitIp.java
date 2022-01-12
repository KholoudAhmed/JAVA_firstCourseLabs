/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package splitingip;

import java.util.StringTokenizer;

public class SplitIp {
    public static void main(String[] args)
    {
        /*
        if(args.length == 1)
        {
            // first  put the value of args[0] in a wrapper class string
            String stringIp = args[0];
            
            // using split function to split the string
            String[] stringIpArr = stringIp.split("[.]");
            
            // check of the stringIpArr indeces to split ip address
            if(stringIpArr.length == 4)
            {
                System.out.println("here are the split elements");
                for(String s : stringIpArr)
                {
                    System.out.println(s);
                }
            }
            else
            {
                System.out.println("Invalid Ip Address");
            }
            
        }*/
        // using stringTokinizer
        StringTokenizer stringIp = new StringTokenizer(args[0], ".");
        while(stringIp.hasMoreTokens())
        {
            System.out.println(stringIp.nextToken());
        }
    }
    
}
