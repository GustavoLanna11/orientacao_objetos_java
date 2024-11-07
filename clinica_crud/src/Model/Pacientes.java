/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Pacientes {
    private int codigo;
    private String nome;
    private String endereco;
    private String complemento;
    private String RG;
    private String CPF;
    private String data_nasc;
    
    Conexao con = new Conexao();

    public Pacientes() {
        this(0, "", "", "", "", "", "");
    }

    public Pacientes(int codigo, String nome, String endereco, String complemento, String RG, String CPF, String data_nasc) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.complemento = complemento;
        this.RG = RG;
        this.CPF = CPF;
        this.data_nasc = data_nasc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }
    
    public void cadastrarUsuario(){           
      String sql= "Insert into pacientes(Codigo, Nome,endereco,complemento,rg, cpf, data_nasc)values "+
                "(" +this.getCodigo()+", '"+ this.getNome()+"','"+this.getEndereco()+"','"+this.getComplemento()+"','"+ this.getRG()+"','"+this.getCPF()+"','"+this.getData_nasc()+"' )";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }
 
     public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from pacientes";
        tabela = con.RetornarResultset(sql);
     return tabela;   
    }
     
     public void excluir(){
        String sql;
        sql= "Delete from pacientes where codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
     
     public void alterar(){
        //adicionar campo de login e senha
        String sql;
        sql="Update pacientes set nome='"+ getNome()+"',endereco='"+getEndereco()+"',complemento='"+getComplemento()+"',rg='"+getRG()+"',cpf='"+getCPF()+"',data_nasc='"+getData_nasc()+"' where codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
    }
     
      public ResultSet consultarCampoEspecifico(){
        ResultSet tabela;
        tabela = null;
    
        try{
          String sql="Select * from pacientes where nome like '"+ getNome()+"%'";
          tabela= con.RetornarResultset(sql);                  
       
           }
           catch(Exception sqle){
                JOptionPane.showMessageDialog(null,"Atenção..."+sqle.getMessage());
           }
        return tabela;    
    }
    
 //método para login
//  public ResultSet logar()
//    {
//        ResultSet tabela;
//        tabela = null;
//        
//         String sql = "select * from pacientes where login= '" + getLogin() + "' and senha= '" + getSenha() + "' " ;
//          tabela= con.RetornarResultset(sql);  
//          return tabela;
//    }   
      
    
    
}
