/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fatec-dsm2
 */
public class Pacientes {
    private int codigo;
    private String nomePaciente;
    private String endereco;
    private String complemento;
    private String RG;
    private String CPF;
    private String dataNasc;
    
    public Pacientes() {
        this(0, "","","","","", "");
    }

    public Pacientes(int codigo, String nomePaciente, String endereco, String complemento, String RG, String CPF, String dataNasc) {
        this.codigo = codigo;
        this.nomePaciente = nomePaciente;
        this.endereco = endereco;
        this.complemento = complemento;
        this.RG = RG;
        this.CPF = CPF;
        this.dataNasc = dataNasc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    
    
    
    
    
    
}
