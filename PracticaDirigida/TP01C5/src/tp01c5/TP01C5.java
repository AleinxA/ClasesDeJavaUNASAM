package tp01c5;

import java.text.DecimalFormat;
import javax.swing.*;

public class TP01C5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
          double lado1,lado2,lado3;
          double area,semipe;
          JOptionPane.showMessageDialog(null, "Bienvenido.\nLe ayudaremos a hallar el area de un triangulo con el valor de sus lados.\nA continuación ingrese los datos solicitados.","Información Previa",JOptionPane.INFORMATION_MESSAGE);
          lado1=Double.parseDouble(JOptionPane.showInputDialog("Ingresar el primer lado del triángulo"));
          lado2=Double.parseDouble(JOptionPane.showInputDialog("Ingresar el segundo lado del triángulo"));
          lado3=Double.parseDouble(JOptionPane.showInputDialog("Ingresar el tercer lado del triángulo"));
          DecimalFormat f2 = new DecimalFormat("0.00") ;
          
          if(lado1+lado2>lado3&&lado2+lado3>lado1&&lado1+lado3>lado2){
              semipe=(lado1+lado2+lado3)/2;
              area=Math.sqrt(semipe*(semipe-lado1)*(semipe-lado2)*(semipe-lado3));
              JOptionPane.showMessageDialog(null,"El área del triángulo es: "+ f2.format(area)+
              "\nEl triángulo si éxiste");
          }else{
              JOptionPane.showMessageDialog(null,"El triángulo no existe");
              
          }
    }
    
}
