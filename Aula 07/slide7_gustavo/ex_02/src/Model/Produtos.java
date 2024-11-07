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
 * @author Gustavo Lanna
 */
public class Produtos {
    private int codigo;
    private String nomeProduto;
    private String descricao;

    private Conexao con = new Conexao();
    
    public Produtos() {
        this(0,"","");
    }

    public Produtos(int codigo, String nomeProduto, String descricao) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
    }

    public Conexao getCon() {
        return con;
    }

    public void setCon(Conexao con) {
        this.con = con;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void cadastrarProduto(){
        String sql = "Insert into produtos(codigo, nomeProduto, descricao) VALUES "+
                "("+this.getCodigo()+", '"+this.getNomeProduto()+"', '"+this.getDescricao()+"' )";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso!");
    }
    
    public void excluirProduto(){
        String sql;
        sql = "Delete from produtos where codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
    }
    
    public void alterarProduto(){
        String sql;
        sql = "Update produtos set nomeProduto='"+this.getNomeProduto()+"'   ,    "
                + "descricao= '"+this.getDescricao()+ "' where codigo="+this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
    }
    
    public ResultSet consultarProduto(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from produtos";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    
    
    
    
}
