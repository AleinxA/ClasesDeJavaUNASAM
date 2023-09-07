package ejercicio03;

import javax.swing.JOptionPane;

/**
 *
 * @author alein
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        int i=1, factorial=1;
        String message="Factorial de los numeros del 1 al 15\n\n";
        while (i<=15){
            factorial*=i;
            message+="El factorial de "+i+" es: "+factorial+"\n";
            i++;
        }
        JOptionPane.showMessageDialog(null,message,"Factorial del 1 al 15",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
