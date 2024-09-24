
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gustavo.marques
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1-Somar \n 2-Subtrair \n 3-Multiplicar \n 4-Dividir \n 0-Sair"));
            
            switch(op){
                case 1:
                    cal.somar();
                    JOptionPane.showMessageDialog(null, "A soma dos números é: "+ cal.getR());
                    break;
                case 2:
                    cal.subtrair();
                    JOptionPane.showMessageDialog(null, "A subtração dos números é: "+ cal.getR());
                    break;
                
                case 3:
                    cal.mutiplicar();
                    JOptionPane.showMessageDialog(null, "A multiplicação dos números é: "+ cal.getR());
                    break;
                    
                case 4:
                    cal.dividir();
                    JOptionPane.showMessageDialog(null, "A divisão dos números é: "+ cal.getR());
                    break;
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. ");
            }
        }
        while (op != 0);
    }
    
}
