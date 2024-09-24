
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
public class Consorcio {
    private int numeroTotalPrestacoes;
    private int qtdPrestacoesPagas;
    private double valorPrestacao;
    private double saldoDevedor;
    private double totalPago;

    public Consorcio() {
        this(0,0,0.0,0.0,0.0);
    }

    public Consorcio(int numeroTotalPrestacoes, int qtdPrestacoesPagas, double valorPrestacao, double saldoDevedor, double totalPago) {
        this.numeroTotalPrestacoes = numeroTotalPrestacoes;
        this.qtdPrestacoesPagas = qtdPrestacoesPagas;
        this.valorPrestacao = valorPrestacao;
        this.saldoDevedor = saldoDevedor;
        this.totalPago = totalPago;
    }

    public int getNumeroTotalPrestacoes() {
        return numeroTotalPrestacoes;
    }

    public void setNumeroTotalPrestacoes(int numeroTotalPrestacoes) {
        this.numeroTotalPrestacoes = numeroTotalPrestacoes;
    }

    public int getQtdPrestacoesPagas() {
        return qtdPrestacoesPagas;
    }

    public void setQtdPrestacoesPagas(int qtdPrestacoesPagas) {
        this.qtdPrestacoesPagas = qtdPrestacoesPagas;
    }

    public double getValorPrestacao() {
        return valorPrestacao;
    }

    public void setValorPrestacao(double valorPrestacao) {
        this.valorPrestacao = valorPrestacao;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
    
    public void inserirValoresConsorcio(){
        setNumeroTotalPrestacoes(Integer.parseInt(JOptionPane.showInputDialog("Insira o número total de prestações:")));
        setValorPrestacao(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação: ")));
        setQtdPrestacoesPagas(Integer.parseInt(JOptionPane.showInputDialog("Inisra a quantidade de prestações que já foram pagas:")));
        
    }
    
    public double calcularTotalPago(){
        setTotalPago(getValorPrestacao()*getQtdPrestacoesPagas());
        return getTotalPago();
    }
    
    public double calcularSaldoDevedor(){
        setSaldoDevedor((getNumeroTotalPrestacoes() * getValorPrestacao()) - getTotalPago());
        return getSaldoDevedor();
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "O valor total pago até o momento é: " + getTotalPago()
        + ".\nO saldo devedor é de: " + getSaldoDevedor());
    }
    
}
