package Exercises;

public class Padre {
    public String apellido;
    
    public Padre(String apellido) {
this.apellido = apellido;
    }

    public boolean test() {
        Hijo hijo = new Hijo("Juan", this.apellido);
        EspirituSanto espiritu = new EspirituSanto(hijo.nombre, this.apellido, "Lopez");
        return espiritu.pruebaParternidad();
    }  
}