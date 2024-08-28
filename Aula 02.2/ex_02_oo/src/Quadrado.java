
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
public class Quadrado {
    private double numero;
    private double resultado;
    
    private Scanner leia = new Scanner (System.in);

    public Quadrado() {
        this(0,0);
    }

    public Quadrado(double numero, double resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void calcularQuadrado(){
        System.out.println("Digite um número: ");
        setNumero (leia.nextDouble());
        
        resultado = numero * numero;
    }
    
    public void mostrarQuadrado(){
        System.out.println("O resultado do número ao quadrado é: "+getResultado());
    }
    
    
}
