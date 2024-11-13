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
public class Filmes {
    private int codigo;
    private String titulo;
    private String genero;
    private String produtora;
    private String data_compra;

    Conexao con = new Conexao();
    
    public Filmes() {
        this(0, "", "", "", "");
    }

    public Filmes(int codigo, String titulo, String genero, String produtora, String data_compra) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.produtora = produtora;
        this.data_compra = data_compra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getData_compra() {
        return data_compra;
    }

    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }
    
   public void cadastrarFilmes(){           
      String sql= "Insert into filmes (Codigo, titulo,genero,produtora,data_compra)values "+
                "(" +this.getCodigo()+", '"+ this.getTitulo()+"','"+this.getGenero()+"','"+this.getProdutora()+"','"+ this.getData_compra()+"' )";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }
    
   public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from filmes";
        tabela = con.RetornarResultset(sql);
     return tabela;   
    }
   
    public void excluir(){
        String sql;
        sql= "Delete from filmes where codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    
    public void alterar(){
        //adicionar campo de login e senha
        String sql;
        sql="Update filmes set titulo='"+ getTitulo()+"',genero='"+getGenero()+"',produtora='"+getProdutora()+"',data_compra='"+getData_compra()+"' where codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
    }
    
       public ResultSet consultarCampoEspecifico(){
        ResultSet tabela;
        tabela = null;
    
        try{
          String sql="Select * from filmes where titulo like '"+ getTitulo()+"%'";
          tabela= con.RetornarResultset(sql);                  
       
           }
           catch(Exception sqle){
                JOptionPane.showMessageDialog(null,"Atenção..."+sqle.getMessage());
           }
        return tabela;    
    }
}
