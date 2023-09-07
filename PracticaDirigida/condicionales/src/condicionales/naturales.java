package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author alein
 */
public class naturales {
    
    public static void main(String[] args) {
        int naturales=1,nat=1;
        String message ="";
        boolean comp = true;
        do{
        System.out.print(naturales+"\n");
        naturales+=1;
        if (naturales > 100) comp=false;
        }while(comp==true);
        while (nat<100){
            message += nat + ", ";
            nat+=1;            
        }
        JOptionPane.showMessageDialog(null, message, "Numeros del uno al 100", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
}
