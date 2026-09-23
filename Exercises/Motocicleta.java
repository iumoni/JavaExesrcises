package Exercises;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

public Motocicleta(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
}

@Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Cilindrada: " + cilindrada + "cc";
    }
}