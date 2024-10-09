
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
public class CustoPiso {
    private double comprimentoComodo;
    private double larguraComodo;
    private double precoPorArea;
    private double custoTotalComodo;

    public CustoPiso() {
        this(0,0,0,0);
    }

    public CustoPiso(double comprimentoComodo, double larguraComodo, double precoPorArea, double custoTotalComodo) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraComodo = larguraComodo;
        this.precoPorArea = precoPorArea;
        this.custoTotalComodo = custoTotalComodo;
    }

    public double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public double getPrecoPorArea() {
        return precoPorArea;
    }

    public void setPrecoPorArea(double precoPorArea) {
        this.precoPorArea = precoPorArea;
    }

    public double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }
    
    public void inserirValores(){
        setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do comôdo: ")));
        setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do comôdo: ")));
        setPrecoPorArea(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do piso por metro quadrado: ")));
    }
    
    public void calcularprecoArea(){
        setCustoTotalComodo(getComprimentoComodo()*getLarguraComodo()*getPrecoPorArea());
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "O comprimento do comôdo é: " + getComprimentoComodo()+"\n A largura do comôdo é: " 
                + getLarguraComodo()+ "\n O preço por área é: " + getPrecoPorArea()+"\n O preço por comôdo é: " + getCustoTotalComodo() );
    }
    
    
}
