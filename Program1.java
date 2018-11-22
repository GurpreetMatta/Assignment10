/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment10;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Gurpreet Singh
 */
public class Program1 {
    public static void main(String []args)
    {
        Set s1=new HashSet();
        Set s2=new HashSet();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(1);
        s2.add(4);
        s2.add(5);
        System.out.println(s1);
        System.out.println(s2);
       s1.retainAll(s2);
       System.out.println(s1);
    }
}
