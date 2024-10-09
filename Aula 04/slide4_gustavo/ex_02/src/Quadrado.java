
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo Lanna
 */
public class Quadrado {
    private double areaQuadrado;
    private double perimetroQuadrado;

    public Quadrado() {
        this(0.0,0.0);
    }

    public Quadrado(double areaQuadrado, double perimetroQuadrado) {
        this.areaQuadrado = areaQuadrado;
        this.perimetroQuadrado = perimetroQuadrado;
    }

    public double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado(double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }

    public double getPerimetroQuadrado() {
        return perimetroQuadrado;
    }

    public void setPerimetroQuadrado(double perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }
    
    public double calcularArea(double LadoA){
        setAreaQuadrado (Math.pow(LadoA,2));
        return getAreaQuadrado();
    }
    
    public double calcularPerimetro(double LadoA){
        setPerimetroQuadrado(4*LadoA);
        return getPerimetroQuadrado();
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "O valor da área é: "+ getAreaQuadrado()+ " e o perimetro é: "+getPerimetroQuadrado());
    }
    
    
}
