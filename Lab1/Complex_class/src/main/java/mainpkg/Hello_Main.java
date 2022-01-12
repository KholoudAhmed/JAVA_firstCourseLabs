/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;
import complex_class.Complex;
public class Hello_Main {
    public static void main(String[] args)
    {
       Complex cres = new Complex();
       Complex c1 = new Complex();
       Complex c2 = new Complex();
       c1.setReal(5);
       c1.setImg(3);
       c2.setReal(5);
       c2.setImg(2);
       
      
       cres = c1.addComplex(c2);
       cres.print();
  
       /*
       cres = c1.subComplex(c2);
       cres.print();
*/
       
       
    }
    
}
