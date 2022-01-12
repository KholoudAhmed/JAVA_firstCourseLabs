/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class AppletClass {

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        AppletClass task1 = new AppletClass();
        Thread th = new Thread((Runnable) task1);
        th.start();
    }
    
}
