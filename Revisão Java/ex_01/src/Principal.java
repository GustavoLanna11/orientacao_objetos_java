
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
        // TODO code application logic here
        Triangulo tri = new Triangulo();
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite: \n 1-Inserir dados \n 2-Calcular área \n 3-Mostrar Area \n 0-Sair"));
            
            switch(op){
                case 1: 
                    tri.inserirDadosTriangulo();
                    break;
                
                case 2:
                    tri.calcularArea();
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "Essa é a área do triângulo: "+tri.mostrarAreaTriangulo());
                    break;
                 
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. ");
                    break;
            }
        
        } while(op!=0);
    }
}   