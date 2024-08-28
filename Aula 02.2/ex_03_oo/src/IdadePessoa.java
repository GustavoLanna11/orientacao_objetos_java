
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
public class IdadePessoa {
    private int ano;
    private int idade;
    private int anoNasc;
    
    private Scanner leia = new Scanner (System.in);

    public IdadePessoa() {
        this(0,0,0);
    }

    public IdadePessoa(int ano, int idade, int resultado) {
        this.ano = ano;
        this.idade = idade;
        this.anoNasc = anoNasc;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    public void calcularIdade(){
        System.out.println("Digite o ano atual: ");
        setAno (leia.nextInt());
        
        System.out.println("Digite o ano de nascimento: ");
        setAnoNasc (leia.nextInt());
        
        idade = ano - anoNasc;
    }
    
    public void mostrarIdade (){
        System.out.println("Sua idade é: "+getIdade());
    }
    
}
