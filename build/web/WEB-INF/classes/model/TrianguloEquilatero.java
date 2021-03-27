package model;

/**
 *
 * @author jmmm9_000
 */
public class TrianguloEquilatero {
    
    private double base;
    private double altura;
    
    public TrianguloEquilatero(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double getArea(){
        return (this.base*this.altura)/2;
    }
    
    public double getPerimetro(){
        return this.base * 3;
    }
    }
    

   

   