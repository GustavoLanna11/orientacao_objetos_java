
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
        setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento do comôdo: ")));
        setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog("Inisra a largura do comôdo: ")));
        setPrecoPorArea(Double.parseDouble(JOptionPane.showInputDialog("Inisra o preço do piso por m²: ")));
    }
    
    public void calcularprecoArea(){
        setCustoTotalComodo(getComprimentoComodo()*getLarguraComodo()*getPrecoPorArea());
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "O comprimento do comôdo é: " + getComprimentoComodo());
        JOptionPane.showMessageDialog(null, "A largura do comôdo é: " + getLarguraComodo());
        JOptionPane.showMessageDialog(null, "O preço por área para assentar o piso é: " + getPrecoPorArea());
        JOptionPane.showMessageDialog(null, "O preço para assentar o piso neste comôdo é: " + getCustoTotalComodo());
    }
    
    
}
