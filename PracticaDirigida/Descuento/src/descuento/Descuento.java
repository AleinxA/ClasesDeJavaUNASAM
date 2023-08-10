/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package descuento;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author alein
 */
public class Descuento {

    public static void main(String[] args) {
        //Declaración de Variables
        double  monto; 
        double descuento, neto;
        DecimalFormat f2 = new DecimalFormat("0.00");
        monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto:"));
        if (monto >500){
            descuento = monto*0.2;
            neto = monto - descuento;
            JOptionPane.showMessageDialog(null,"El monto a pagar es " + neto + "\nUsted tiene un descuento de " + descuento);
        }
        else{
            JOptionPane.showMessageDialog(null,"El monto a pagar es "+ monto + "\n Usted no tiene ");
        }
    }

    private static String f2(double descuento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
