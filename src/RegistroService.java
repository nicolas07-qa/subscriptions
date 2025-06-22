public class RegistroService {
    public boolean registrar(String nombre, String correo, String contrasena) {
        if (nombre.isBlank() || correo.isBlank() || contrasena.isBlank()) {
            System.out.println("❌ Todos los campos son obligatorios.");
            return false;
        }

        for (Usuario u : BaseDatosSimulada.usuarios) {
            if (u.getCorreo().equalsIgnoreCase(correo)) {
                System.out.println("⚠️ El correo ya está en uso.");
                return false;
            }
        }

        Usuario nuevo = new Usuario(nombre, correo, contrasena);
        BaseDatosSimulada.usuarios.add(nuevo);
        System.out.println("✅ Usuario registrado con éxito.");
        return true;
    }
}