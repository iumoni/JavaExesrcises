package Exercises;

public class Automovil extends Vehiculo {
    private int numPuertas;

    public Automovil(String marca, String modelo, int numPuertas) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    @Override 
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Puertas: " + numPuertas;
        }
    }