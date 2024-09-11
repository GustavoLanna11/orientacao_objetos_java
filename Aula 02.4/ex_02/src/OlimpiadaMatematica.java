
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo Lanna
 */
public class OlimpiadaMatematica {
    private String nome;
    private String endereco;
    private double media;
    private double notaMenor;
    private double notaMaior;

    Scanner leia = new Scanner (System.in);
    
    public OlimpiadaMatematica() {
        this("","",0,0,0);
    }

    public OlimpiadaMatematica(String nome, String endereco, double media, double nomaMenor, double notaMaior) {
        this.nome = nome;
        this.endereco = endereco;
        this.media = media;
        this.notaMenor = notaMenor;
        this.notaMaior = notaMaior;
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

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNotaMenor() {
        return notaMenor;
    }

    public void setNotaMenor(double notaMenor) {
        this.notaMenor = notaMenor;
    }

    public double getNotaMaior() {
        return notaMaior;
    }

    public void setNotaMaior(double notaMaior) {
        this.notaMaior = notaMaior;
    }
    
    public void CalculaMedia(){
        System.out.println("Digite seu nome: ");
        setNome (leia.next());
        
        System.out.println("Digite seu endereço: ");
        setEndereco (leia.next());
        
        System.out.println("Digite sua maior nota: ");
        setNotaMaior(leia.nextDouble());
        
        System.out.println("Digite sua menor nota: ");
        setNotaMenor(leia.nextDouble());
        
        setMedia(getNotaMenor() + getNotaMaior()/2);
    }
    
    public void verificarMedia(){
        System.out.println("O nome do aluno é: "+getNome());
        System.out.println("O endereço do aluno é: "+getEndereco());
        System.out.println("Sua maior note é: "+getNotaMaior());
        System.out.println("Sua menor note é: "+getNotaMenor());
        
        if(media > 9){
            System.out.println("Aluno inscrito. ");
        }
        
        else if(media < 9){
            System.out.println("Média insuficiente. ");
        }
        
        System.out.println("Sua média é: "+getMedia());
    }
}
