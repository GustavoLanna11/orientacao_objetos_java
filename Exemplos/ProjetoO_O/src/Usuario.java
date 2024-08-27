
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
public class Usuario {
    //Declarar atributos da classe usuário
    
    private String nome;
    private String email;
    private int idade;
    private String endereco;

    //Construtor da classe usuário
    //Inicialização dos valores dos atributos
    //Botao direito - inserir codigo - construtor (não marca nada)
    public Usuario() {
        this("","",0,"");
    }

    //Botao direito - inserir codigo - construtor (marca tudo)
    public Usuario(String nome, String email, int idade, String endereco) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    //Encapsulamento dos atributos
    //Botao direito - inserir codigo - getter e setter (marca tudo)
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
    //Métodos
    public void guardarDados()
    {
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o nome do usuário: ");
        setNome(leia.next());
        System.out.println("Digite o email do usuário: ");
        setEmail(leia.next());
        System.out.println("Digite a idade do usuário: ");
        setIdade(leia.nextInt());
        System.out.println("Digite o endereço do usuário: ");
        setEndereco (leia.next());
    }
    
    public void mostrarDados()
    {
        System.out.println("\n Dados do usuário: \n Nome: " +getNome()+ " \n email: " +getEmail()+ " \n idade: " +getIdade()+ " \n endereço: " + getEndereco());
    }
    
}
