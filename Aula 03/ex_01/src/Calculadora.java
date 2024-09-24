
import java.util.Scanner;
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
public class Calculadora {
    private double n1;
    private double n2;
    private double r;

    Scanner leia = new Scanner(System.in);
    
    public Calculadora() {
        this(0,0,0);
    }

    public Calculadora(double n1, double n2, double r) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public void somar(){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        this.setR(n1+n2);
    }
    
    public void subtrair(){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        this.setR(n1-n2);
    }
    
    public void mutiplicar(){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        this.setR(n1*n2);
    }
     public void dividir(){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        this.setR(n1/n2);
    }
    
    
    
    
}
