
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
        Funcionario func = new Funcionario();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite:"
                    + "\n1 - Cadastrar funcionário."
                    + "\n2 - Calcular o salário."
                    + "\n3 - Listar funcionário."
                    + "\n0 - Sair."));
            switch(op){
                case 1:
                    func.cadastrarFuncionario();
                    break;
                case 2:
                    func.calcularSalarioFinal();
                    break;
                case 3:
                    func.listarFuncionario();
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