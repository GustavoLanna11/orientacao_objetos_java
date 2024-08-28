
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
public class MediaMatematica {
    private String nome;
    private double numero1;
    private double numero2;
    private double media;
    
    private Scanner leia = new Scanner (System.in);

    public MediaMatematica() {
        this("",0,0,0);
    }

    public MediaMatematica(String nome, double numero1, double numero2, double media) {
        this.nome = nome;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.media = media;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public void calcularMedia(){
        System.out.println("Digite o nome do aluno: ");
        setNome (leia.next());
        
        System.out.println("Digite a primeira nota: ");
        setNumero1 (leia.nextDouble());
        
        System.out.println("Digite a segunda nota: ");
        setNumero2 (leia.nextDouble());
        
        media = (numero1 + numero2)/2;
        
        System.out.println("A media do aluno é: "+getMedia());
        
        
        
    }
    
    
}
