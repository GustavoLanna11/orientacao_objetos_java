
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo Lanna
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Quadrado quad = new Quadrado();
        
       Scanner leia = new Scanner(System.in);
       
       int op;
       double LadoA;
       LadoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado A: "));

       do{
           
           op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1 - Calcular a área do quadrado \n 2 - Calcular o perimetro do quadrado \n 3 - Mostrar Valores \n 0 - Sair"));
           
       switch(op){
           case 1:
               quad.calcularArea(LadoA);
               break;
            
           case 2:
               quad.calcularPerimetro(LadoA);
               break;
               
           case 3: 
               quad.mostrarValores();
               break;
               
           case 0:
               JOptionPane.showMessageDialog(null, "Finalizando... ");
               break;
               
           default:
               JOptionPane.showMessageDialog(null, "Opção Inválida"); 
                    break;
       }
       } while (op != 0);
    }
    
}
