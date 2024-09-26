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
public class Prefeitura {
    private String cod;
    private String Prefeitura;
    private String cidade;
    
    Conexao con = new Conexao();
    
    public Prefeitura() {
        this("", "", "");
    }

    public Prefeitura(String cod, String Prefeitura, String cidade) {
        this.cod = cod;
        this.Prefeitura = Prefeitura;
        this.cidade = cidade;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getPrefeitura() {
        return Prefeitura;
    }

    public void setPrefeitura(String Prefeitura) {
        this.Prefeitura = Prefeitura;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
     public void gravar(){
        String sql;
        sql = "Insert into prefeitura (codigo, prefeitura, cidade) VALUES "+
                "('" +getCod() + "', '" +getPrefeitura() + "', '"+getCidade() + "')";
        
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!");
    }
    
    public ResultSet listarPrefeituras(){
        ResultSet tabela;
        tabela = null;
        String sql = "select * from prefeitura";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    
}
