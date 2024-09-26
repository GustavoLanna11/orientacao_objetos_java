
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
public class Funcionario {
    private String nomeFuncionario;
    private String telefoneFuncionario;
    private String enderecoFuncionario;
    private double salarioHora;
    private double salarioFinal;
    private double horasTrabalhadas;

    public Funcionario() {
        this("","","",0.0,0.0,0.0);
    }

    public Funcionario(String nomeFuncionario, String telefoneFuncionario, String enderecoFuncionario, double salarioHora, double salarioFinal, double horasTrabalhadas) {
        this.nomeFuncionario = nomeFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
        this.salarioHora = salarioHora;
        this.salarioFinal = salarioFinal;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    
    public void cadastrarFuncionario(){
        setNomeFuncionario(JOptionPane.showInputDialog("Insira o nome do funcionário: "));
        setEnderecoFuncionario(JOptionPane.showInputDialog("Insira o endereço do funcionário: "));
        setTelefoneFuncionario(JOptionPane.showInputDialog("Insira o telefone do funcionário: "));
        setSalarioHora(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor que esse funcionário recebe por hora trabalhada: ")));
        setHorasTrabalhadas(Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas: ")));
    }
    
    public double calcularSalarioFinal(){
        setSalarioFinal(getHorasTrabalhadas() * getSalarioHora());
        return getSalarioFinal();
    }
    
    public void listarFuncionario(){
        JOptionPane.showMessageDialog(null, "**DADOS DO FUNCIONÁRIO**"
        + "\nNome: " + getNomeFuncionario()
        + "\nEndereço: " + getEnderecoFuncionario()
        + "\nTelefone: " + getTelefoneFuncionario()
        + "\nHoras trabalhadas: " + getHorasTrabalhadas()
        + "\nValor do salário por hora:" + getSalarioHora()
        +"\nValor do salário final: " + getSalarioFinal()
        );
    }
    

}
