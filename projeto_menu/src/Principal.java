
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciando objeto da classe Caixa
        Caixa cx = new Caixa();
        
        int op;
        //Comando do-while, comando de repetição para o menu
        do {
            //JOptionPane.showInputDialog = caixa para entrada de dados
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1-Depositar \n 2-Sacar \n 3-Consultar Saldo \n 0-Sair"));
            //comando de condição swicth-case para verificar qual opção digitada
            
            switch (op) {
            case 1: 
                cx.depositar();
                break;
            case 2: 
                cx.sacar();
                break;
            case 3: 
                //Mostra os valores
                JOptionPane.showMessageDialog(null, "Saldo atual: "+cx.MostrarSaldo());
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
