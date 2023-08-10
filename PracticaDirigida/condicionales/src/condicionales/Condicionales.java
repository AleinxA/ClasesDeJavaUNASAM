/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author alein
 */
public class Condicionales {

    public static void main(String[] args) {
        
//        int a, b;
//        
//        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
//        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));
//        
//        if (a==b)
//            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
//        else
//            if(a<b)
//                JOptionPane.showMessageDialog(null, b + " es mayor que " + a);
//            else
//                JOptionPane.showMessageDialog(null, a + " es mayor que " + b);
//        int a, b, c;
//        
//        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
//        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));
//        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c: "));
//        
//        if (a<b && a<c)
//            JOptionPane.showMessageDialog(null, "El menor es "+a);
//            else
//            if(b<a && b<c)
//                JOptionPane.showMessageDialog(null, "El menor es "+b);
//                else
//                JOptionPane.showMessageDialog(null, "El menor es "+c);
        int a, b, c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c: "));
        
        if (a>b && a>c)
            JOptionPane.showMessageDialog(null, "El mayor es "+a);
            else
            if(b>a && b>c)
                JOptionPane.showMessageDialog(null, "El mayor es "+b);
                else
                JOptionPane.showMessageDialog(null, "El mayor es "+c);
        
    }
    
}
