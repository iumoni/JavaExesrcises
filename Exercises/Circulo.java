package Exercises;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        if(radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 0;
        }
    }

    @Override 
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}