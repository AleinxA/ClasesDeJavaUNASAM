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
//        int a, b, c;
//        
//        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
//        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));
//        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c: "));
//        
//        if (a>b && a>c)
//            JOptionPane.showMessageDialog(null, "El mayor es "+a);
//            else
//            if(b>a && b>c)
//                JOptionPane.showMessageDialog(null, "El mayor es "+b);
//                else
//                JOptionPane.showMessageDialog(null, "El mayor es "+c);
        
//        int a, b, c, d, may1, may2, mayor;
//        
//        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
//        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));
//        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c: "));
//        d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de d: "));
//        
//        if(a<b)
//            may1=b;
//        else
//            may1=a;
//        if(c<d)
//            may2=d;
//        else
//            may2=c;
//        if (may1<may2)
//            JOptionPane.showMessageDialog(null, "El mayor es "+ may2);
//        else
//            JOptionPane.showMessageDialog(null, "El mayor es "+ may1);
            String nombre1 =JOptionPane.showInputDialog("Ingrese el nombre de la primera persona");
            String nombre2 =JOptionPane.showInputDialog("Ingrese el nombre de la primera persona");
            int edad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de " + nombre1));
            int edad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de " + nombre2));
            
            if (edad1<edad2) {
            JOptionPane.showMessageDialog(null, "La primera persona es mayor que la segunda persona.");
                if (edad1>=18) {
                    JOptionPane.showMessageDialog(null, "La primera persona puede votar");
                }
                else{
                    JOptionPane.showMessageDialog(null, "La primera persona puede votar");
                }
            JOptionPane.showMessageDialog(null, "La segunda persona es mayor que la primera persona.");
        }
    }
    
}
