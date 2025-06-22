public class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;

    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    @Override
    public String toString() {
        return "👤 Usuario: " + nombre + " | 📧 " + correo;
    }
}