package ejercicio01;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author alein
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese las horas trabajadas: "));
        int horasExtra = 0;
        DecimalFormat f2 = new DecimalFormat("0.00");
        double salarioNeto = 0, saldoBruto,impuestos,impSalario = 0;
        if (horasTrabajadas<=40){
            saldoBruto = 30*horasTrabajadas;
        }
        else {
            horasExtra = horasTrabajadas - 40;
            saldoBruto=(horasExtra*45)+(horasTrabajadas*30);
        }
        if (saldoBruto<1000){
            salarioNeto=saldoBruto;
        }
        else {
            if (saldoBruto<=1400&&saldoBruto>1000) {
                impuestos=0.1;
                impSalario=(saldoBruto-1000)*impuestos;
                salarioNeto=saldoBruto-impSalario;
            }
            else {
                impuestos=0.2;
                impSalario=(400*.1)+((saldoBruto-1400)*impuestos);
                salarioNeto=saldoBruto-impSalario;
            }
        }

        String message="Resultados\nSalario Bruto:"+saldoBruto+"\nHoras trabajadas: "+horasTrabajadas+"\nHoras Extras: "+horasExtra+"\n\nSalario Neto: "+f2.format(salarioNeto)+"\nImpuestos: "+ f2.format(impSalario);
        JOptionPane.showMessageDialog(null,message,"Resultados",JOptionPane.INFORMATION_MESSAGE);
    }
}
