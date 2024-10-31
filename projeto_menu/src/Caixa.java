
import java.util.Scanner;
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
public class Caixa {
    
    private double saldo;
    private double valor;
    
    private Scanner leia = new Scanner (System.in);

    public Caixa() {
        this(0.0,0.0);
    }

    public Caixa(double saldo, double valor) {
        this.saldo = saldo;
        this.valor = valor;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void depositar(){
       setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: ")));
       setSaldo(getSaldo() + getValor());
       
    }
    
    public void sacar(){
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: ")));
        setSaldo(getSaldo() - getValor());
    }
    
    public double MostrarSaldo(){
        return getSaldo();
    }
    
    
}
