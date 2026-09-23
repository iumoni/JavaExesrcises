package Exercises;

public class UsuarioProfesor extends Usuario {
    public UsuarioProfesor(String nombre) {
        super(nombre);
    } 

    @Override
    public int limitePrestamos() {
        return 10;
    }

}