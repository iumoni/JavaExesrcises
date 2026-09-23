package Exercises;

public class NotificacionConsola extends Notificacion {
    @Override 
    public String enviar(String mensaje) {
        return "Notificacion en consola: " + mensaje;
    }
}