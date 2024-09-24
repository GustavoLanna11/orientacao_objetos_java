/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author gustavo.marques
 */
public class Usuario {
    private String nome;
    private String email;
    private String login;
    private String senha;

    Conexao con = new Conexao();
    
    public Usuario() {
        this("","","","");
    }

    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void cadastrar(){
        String sql;
        sql = "Insert into cliente (nome, login, senha, email) VALUES "+
                "('" +getNome() + "', '" +getLogin() + "', '"+getSenha() + "', '"+getEmail()+"')";
        
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!");
    }
    
    public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        String sql = "select * from cliente";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}
