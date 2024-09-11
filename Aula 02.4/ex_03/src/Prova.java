
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
public class Prova {
    private String nome;
    private String nivel;
    private double pontos;

    Scanner leia = new Scanner(System.in);
    
    public Prova() {
        this("","",0);
    }

    public Prova(String nome, String nivel, double pontos) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }
    
    public void nivelProva(){
        System.out.println("Digite seu nome: ");
        setNome (leia.next());
        
        System.out.println("Digite seus pontos: ");
        setPontos(leia.nextDouble());
        
        if(pontos <= 100){
            nivel = ("Nivel 1");
        }
        
        else if(pontos > 100 && pontos < 200){
            nivel = ("Nivel 2");
        }
        
        else if(pontos > 200){
            nivel = ("Nivel 3");
        }
    }
    
    public void listarSituacao(){
        System.out.println("Seu nome: "+getNome());
        System.out.println("Seus pontos: "+getPontos());
        System.out.println("Seu nível: "+getNivel());
        
    }
    
    
}
