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
public class Vendas {
    private String codigo;
    private String nomeVendedor;
    private String nomeProduto;

    Conexao con = new Conexao();
    
    public Vendas() {
        this("","","");
    }

    public Vendas(String codigo, String nomeVendedor, String nomeProduto) {
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.nomeProduto = nomeProduto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    public void cadastrarVenda(){
        String sql;
        sql = "Insert into vendas (codigo, nomeVendedor, nomeProduto) VALUES "+
                "('" +getCodigo() + "', '" +getNomeVendedor() + "', '"+getNomeProduto() + "')";
        
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!");
    }
    
    public ResultSet listaVenda(){
        ResultSet tabela;
        tabela = null;
        String sql = "select * from vendas";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    
}
