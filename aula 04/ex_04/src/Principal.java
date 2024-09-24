
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
        // TODO code application logic here
        Consorcio cons = new Consorcio();
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n"
                    + "1 - Inserir os valores do consórcio\n"
                    + "2 - Calcular o valor total pago\n"
                    + "3 - Calcular o saldo devedor\n"
                    + "4 - Mostrar os valores\n"
                    + "0 - Sair"));
            switch(op){
                case 1:
                    cons.inserirValoresConsorcio();
                    break;
                case 2:
                    cons.calcularTotalPago();
                    break;
                case 3:
                    cons.calcularSaldoDevedor();
                    break;
                case 4:
                    cons.mostrarValores();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
            }
        }while(op != 0);
    }
    
}