public class SuscripcionService {
    public void suscribirUsuario(String correo) {
        BaseDatosSimulada.suscripciones.add(correo);
        System.out.println("📚 Usuario suscrito exitosamente al plan estándar.");
    }

    public void listarSuscripciones() {
        if (BaseDatosSimulada.suscripciones.isEmpty()) {
            System.out.println("ℹ️ No hay suscripciones activas.");
        } else {
            System.out.println("✅ Suscripciones activas:");
            for (String correo : BaseDatosSimulada.suscripciones) {
                System.out.println(" - " + correo);
            }
        }
    }
}