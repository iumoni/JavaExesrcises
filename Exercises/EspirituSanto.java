package Exercises;

public class EspirituSanto extends Hijo {
    public String apellidoReal;

    public EspirituSanto(String nombre, String apellido, String apellidoReal){
        super(nombre,apellido);
        this.apellidoReal = apellidoReal;
    }

    public Boolean pruebaParternidad(){
        return this.apellido != null && this.apellido.equals(this.apellidoReal);
    }

}