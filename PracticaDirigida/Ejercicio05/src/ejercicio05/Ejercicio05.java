package ejercicio05;

import javax.swing.JOptionPane;

/**
 *
 * @author alein
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        int i=1, number=0, limite=0, resultado;
        String Limite="",Numero="",message="RESULTADO\n";
        //Entrada de positivos y solucionando el problema de variables nulas
        do {
            Numero=JOptionPane.showInputDialog(null,"Ingrese el número: ","Entrada de Datos",JOptionPane.QUESTION_MESSAGE);
            if (Numero.isEmpty()||number<0) JOptionPane.showMessageDialog(null,"Por favor ingrese un valor valido", "Error", JOptionPane.WARNING_MESSAGE);
            number=Integer.parseInt(Numero);
        }while (Numero.isEmpty()||number<0);
        do {
            Limite=JOptionPane.showInputDialog(null,"Ingrese el limite: ","Entrada de Datos",JOptionPane.QUESTION_MESSAGE);
            if (Limite.isEmpty()||limite<0) JOptionPane.showMessageDialog(null,"Por favor ingrese un valor valido", "Error", JOptionPane.WARNING_MESSAGE);
            limite=Integer.parseInt(Limite);
        }while (Limite.isEmpty()||limite<0);
        //Proceso
        while (i<=limite){
            resultado = number * i;
            message += number + " x " + i +" = "+resultado+"\n";
            i++;
        }
        //Salida
        JOptionPane.showMessageDialog(null,message,"Resultados",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
