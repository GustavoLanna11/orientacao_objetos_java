
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
        
        CalculoEleitores eleit = new CalculoEleitores();
        
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite:\n"
                + "1 - Inserir quantidade de votos\n"
                + "2 - Calcular total de eleitores\n"
                + "3 - Calcular percentual de votos\n"
                + "4 - Mostrar o percentual de votos\n"
                + "0 - Sair"));
        switch(op){
            case 1: 
                eleit.inserirQtdVotos();
                break;
                
            case 2:
                eleit.calcularTotalEleitores();
                break;
                
            case 3:
                eleit.calcularPercentualVotos();
                break;
                
            case 4:
                JOptionPane.showMessageDialog(null, "O percentual de votos em branco é: " + eleit.getPercBrancos());
                JOptionPane.showMessageDialog(null, "O percentual de votos nulos é: " + eleit.getPercNulos());
                JOptionPane.showMessageDialog(null, "O percentual de votos válidos é: " + eleit.getPercValidos());
                break;
                
            case 0:
                JOptionPane.showMessageDialog(null, "Finalizando...");
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida.");
                break;
        }
        }while(op != 0);
    }
    
}
