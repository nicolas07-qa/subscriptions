public class LoginService {
    public boolean login(String correo, String contrasena) {
        for (Usuario u : BaseDatosSimulada.usuarios) {
            if (u.getCorreo().equalsIgnoreCase(correo) && u.getContrasena().equals(contrasena)) {
                System.out.println("✅ Bienvenido de nuevo, " + u.getNombre());
                return true;
            }
        }
        System.out.println("❌ Credenciales inválidas.");
        return false;
    }
}