import java.util.Scanner;

public class MainRoles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA EMPRESARIAL ===");
        System.out.println("1. Cajero");
        System.out.println("2. Administrador");
        System.out.println("3. Supervisor");

        System.out.print("Seleccione un rol: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Clave: ");
        String clave = sc.nextLine();

        switch (opcion) {

            case 1:
                Cajero cajero = new Cajero();

                if (cajero.iniciarSesion(usuario, clave)) {
                    System.out.println("Inicio de sesión correcto.");
                    cajero.gestionarDatos();
                } else {
                    System.out.println("Credenciales incorrectas.");
                }
                break;

            case 2:
                Administrador admin = new Administrador();

                if (admin.iniciarSesion(usuario, clave)) {
                    System.out.println("Inicio de sesión correcto.");
                    admin.gestionarDatos();
                    admin.generarReporte();
                } else {
                    System.out.println("Credenciales incorrectas.");
                }
                break;

            case 3:
                Supervisor supervisor = new Supervisor();

                if (supervisor.iniciarSesion(usuario, clave)) {
                    System.out.println("Inicio de sesión correcto.");
                    supervisor.generarReporte();
                } else {
                    System.out.println("Credenciales incorrectas.");
                }
                break;

            default:
                System.out.println("Opción inválida.");
        }

        sc.close();
    }
}