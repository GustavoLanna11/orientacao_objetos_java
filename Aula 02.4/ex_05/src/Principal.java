
import java.util.Scanner;

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
       Combustivel comb = new Combustivel();
       double doubleKM, doubleValorComb;
       
       Scanner leia = new Scanner (System.in);
       
       System.out.println("Digite a quantidade de KM: ");
       doubleKM = leia.nextDouble();
       System.out.println("Digite o valor do combustível: ");
       doubleValorComb = leia.nextDouble();
       
       comb.calcularLitros(doubleKM);
       comb.calculcarTotalGasto(doubleValorComb);
       
    }
    
}
