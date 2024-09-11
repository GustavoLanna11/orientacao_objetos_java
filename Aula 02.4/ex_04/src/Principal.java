import java.util.Scanner;

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
        Temperatura temp = new Temperatura();
        
        Scanner leia = new Scanner (System.in);
        double doubleF, doubleC;
        
        System.out.println("Digite a temperatura em fahrenheit: ");
        doubleF = leia.nextDouble();
        
        System.out.println("Digite a temperatura em celsius: ");
        doubleC = leia.nextDouble();
        
        temp.calcularTempCelsius(doubleF);
        temp.calcularTempFahrenheit(doubleC);
    }
    
}
