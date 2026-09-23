package Exercises;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

public Rectangulo (double base, double altura) {
    if(base > 0 && altura >0) {
        this.base = base;
        this.altura = altura;
    } else {
        this.base = 0;
        this.altura =0;
    }
}

@Override 
public double calcularArea(){
    return base * altura;
    }

}