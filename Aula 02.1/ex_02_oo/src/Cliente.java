
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Cliente {
    private String nome;
    private String endereco;
    private String RG;

    private Scanner leia = new Scanner (System.in);

    public Cliente() {
        this("","","");
    }
    public Cliente(String nome, String endereco, String RG) {
        this.nome = nome;
        this.endereco = endereco;
        this.RG = RG;
    }
    

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
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

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }
    
    public void cadastrarCliente(){
        System.out.println("Digite seu nome: ");
        setNome(leia.next());
        
        System.out.println("Digite seu endereço: ");
        setEndereco(leia.next());
        
        System.out.println("Digite seu RG: ");
        setRG(leia.next());
    }
    
    public void listarCliente(){
        System.out.println("Nome: " +getNome()+"\n Endereço: "+getEndereco()+"\n RG: "+getRG());
    }
    
    
    
    
}
