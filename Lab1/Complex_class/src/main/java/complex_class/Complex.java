/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complex_class;

/**
 *
 * @author user
 */
public class Complex {
    private int real_Val;
    private int img_Val;
    
    public void setReal(int R)
    {
        real_Val = R;
    }
    public void setImg(int I)
    {
        img_Val = I;
    }
    public int getReal()
    {
        return real_Val;
    }
    public int getImg()
    {
        return img_Val;
    }
    public Complex()
    {
        int real_Val = 0;
        int img_Val = 0;
    }
    public Complex(int real)
    {
        real_Val = real;
    }
    public Complex(int real , int img)
    {
        int real_Val = real;
        int img_Val = img;
    }
    public Complex addComplex(Complex c)
    {
        Complex res = new Complex();
        res.setReal(this.real_Val + c.getReal());
        res.setImg(this.img_Val + c.getImg());
        return res;
    }
    public Complex subComplex(Complex c1)
    {
        Complex sres = new Complex();
        sres.setReal(this.real_Val - c1.getReal());
        sres.setImg(this.img_Val - c1.getImg());
        return sres;
    }
    public void print()
    {
        if(real_Val > 0 && img_Val > 0)
        {
            System.out.println("the Real and Img is  " + real_Val + "+" + img_Val + "i");
        }
        else if(real_Val >0 && img_Val <0)
        {
            System.out.println("the real and img part is  " + real_Val + "-" + img_Val + "i" );
        }
        else if(real_Val >0 && img_Val == 0)
        {
            System.out.println("the real part  " +real_Val );
        }
        else if(real_Val == 0 && img_Val > 0)
        {
            System.out.println("the img part is  " + img_Val + "i");
        }
        else if(real_Val == 0 && img_Val <0)
        {
            System.out.println("the img part is " + img_Val + "i");
        }
        else if(real_Val <0 && img_Val >0)
        {
            System.out.println("the real and img part is  " + real_Val + "+" + img_Val + "i");
        }
    }
}
