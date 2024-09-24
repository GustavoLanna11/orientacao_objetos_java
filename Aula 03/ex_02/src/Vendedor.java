
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
public class Vendedor {
    private String nome;
    private double salarioBase;
    private double valorVendido;
    private double novoSalario;

    public Vendedor() {
        this("",0,0,0);
    }

    public Vendedor(String nome, double salarioBase, double valorVendido, double novoSalario) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.valorVendido = valorVendido;
        this.novoSalario = novoSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }
    
   public void entrarNome(){
      nome = JOptionPane.showInputDialog("Digite o nome: ");
   }
   
   public void salarioBase(){
       double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base: "));
   }
   
   public void valorVendido(){
       
   }
   
   public double calculoComissao(){
       setNovoSalario(((getvalorVendido*10)/100)+getSalarioBase());
       return getSalarioBase;
   }
}
