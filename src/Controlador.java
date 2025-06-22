import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroService registro = new RegistroService();
        LoginService login = new LoginService();
        SuscripcionService suscripciones = new SuscripcionService();

        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Ver suscripciones");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String pass = sc.nextLine();

                    if (registro.registrar(nombre, correo, pass)) {
                        suscripciones.suscribirUsuario(correo);
                    }
                    break;
                case 2:
                    System.out.print("Correo: ");
                    String c = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String p = sc.nextLine();
                    login.login(c, p);
                    break;
                case 3:
                    suscripciones.listarSuscripciones();
                    break;
                case 4:
                    System.out.println("👋 ¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }
        } while (opcion != 4);
        sc.close();
    }
}