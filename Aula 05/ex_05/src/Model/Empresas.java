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
public class Empresas {
    private String CNPJ;
    private String nomeEmpresa;
    private String endereco;

    public Empresas() {
        this("","","");
    }
    
    Conexao con = new Conexao();

    public Empresas(String CNPJ, String nomeEmpresa, String endereco) {
        this.CNPJ = CNPJ;
        this.nomeEmpresa = nomeEmpresa;
        this.endereco = endereco;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void gravar(){
        String sql;
        sql = "Insert into empresa (CNPJ, nomeEmpresa, endereco) VALUES "+
                "('" +getCNPJ() + "', '" +getNomeEmpresa() + "', '"+getEndereco() + "')";
        
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!");
    }
    
    public ResultSet listarEmpresas(){
        ResultSet tabela;
        tabela = null;
        String sql = "select * from empresa";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    
    
}
