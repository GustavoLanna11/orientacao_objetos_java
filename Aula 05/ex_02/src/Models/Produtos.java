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
 * @author fatec-dsm2
 */
public class Produtos {
    private String codigo;
    private String nome;
    private String descricao;
    
    Conexao con = new Conexao();
    
    public Produtos() {
        this("","","");
    }

    public Produtos(String codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void cadastrarProduto(){
        String sql;
        sql = "Insert into produto (codigo, nome, descricao) VALUES "+
                "('" +getCodigo() + "', '" +getNome() + "', '"+getDescricao() + "')";
        
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!");
    }
    
    public ResultSet listarProduto(){
        ResultSet tabela;
        tabela = null;
        String sql = "select * from produto";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
}
