
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo Lanna
 */
public class CategoriaCliente {
    private String nome;
    private double numeroConta;
    private double saldoMedio;

    Scanner leia = new Scanner (System.in);
    public CategoriaCliente() {
        this("",0,0);
    }

    public CategoriaCliente(String nome, double numeroConta, double saldoMedio) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoMedio = saldoMedio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    
    public void verificarSaldo(){
        System.out.println("Digite seu nome: ");
        setNome (leia.next());
        
        System.out.println("Digite o número da conta: ");
        setNumeroConta(leia.nextDouble());
        
        System.out.println("Digite o saldo médio: ");
        setSaldoMedio(leia.nextDouble());
        
        if(saldoMedio < 1000){
            System.out.println("Cliente Comum.");
        } else if(saldoMedio >= 1000 && saldoMedio < 2500){
            System.out.println("Cliente Prata.");
        } else if(saldoMedio >= 2500){
            System.out.println("Cliente Ouro.");
        }
    }
    
    
    
}
