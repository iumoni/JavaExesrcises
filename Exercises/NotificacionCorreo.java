package Exercises;

public class NotificacionCorreo extends Notificacion {
    private String email;

    public NotificacionCorreo(String email) {
        this.email = email;
    }

    @Override
    public String enviar(String mensaje) {
        return "Enviando correo a " + email + ": " + mensaje;
    }
}