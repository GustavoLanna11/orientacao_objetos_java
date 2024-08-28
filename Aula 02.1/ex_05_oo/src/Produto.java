
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
public class Produto {
    
    private String nome;
    private int qtd;
    private double valor;
    private double total;
    
    private Scanner leia = new Scanner (System.in);

    public Produto() {
        this("",0,0,0);
    }

    public Produto(String nome, int qtd, double valor, double total) {
        this.nome = nome;
        this.qtd = qtd;
        this.valor = valor;
        this.total = total;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void calcularTotal(){
        System.out.println("Digite o nome do produto: ");
        setNome (leia.next());
        
        System.out.println("Digite a quantidade de produtos: ");
        setQtd (leia.nextInt());
        
        System.out.println("Digite o valor do produto: ");
        setValor (leia.nextDouble());
        
        total = valor * qtd;
        
        System.out.println("O total do produto é: "+getTotal());
    }
    
    
}
