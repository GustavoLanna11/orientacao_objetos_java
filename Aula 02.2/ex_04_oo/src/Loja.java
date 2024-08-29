
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
public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private double qtdItensComp;
    private double valorTotalCompra;

    Scanner leia = new Scanner(System.in);
    
    public Loja() {
        this("","",0,0,0);
    }

    public Loja(String razaoSocial, String cpfCliente, double valorCompra, double qtdItensComp, double valorTotalCompra) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItensComp = qtdItensComp;
        this.valorTotalCompra = valorTotalCompra;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    
    public void inserirDadosLoja(){
        System.out.println("Digite a razão social: ");
        setRazaoSocial (leia.next());
        
        System.out.println("Digite seu CPF: ");
        setCpfCliente (leia.next());
        
        System.out.println("Digite a quantidade comprada: ");
        setQtdItensComp (leia.nextInt());
        
        System.out.println("Digite o valor: ");
        setValorCompra (leia.nextDouble());
        
    }
    
    public void mostrarDadosLoja(){
        System.out.println("Razão Social: "+getRazaoSocial()+"\n CPF: "+getCpfCliente()+"\n Quantidade: "+getQtdItensComp() +"\n Valor dos itens: "+getValorCompra());
    
    }
    
    public void calcularCompraLoja(){
        valorTotalCompra = qtdItensComp * valorCompra;
        System.out.println("O valor total das suas compras é: "+getValorTotalCompra());
    }
    
    
}
