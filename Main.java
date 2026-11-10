public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("          OBJETOS BIDIMENSIONALES       ");
        System.out.println("========================================");
        try {
            Circulo circulo = new Circulo(5.0);
            circulo.mostrarInformacion();
            System.out.println("----------------------------------------");

            Rectangulo rectangulo = new Rectangulo(8.0, 4.0);
            rectangulo.mostrarInformacion();
            System.out.println("----------------------------------------");

            Cuadrado cuadrado = new Cuadrado(4.0);
            cuadrado.mostrarInformacion();
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        System.out.println("\n========================================");
        System.out.println("          OBJETOS TRIDIMENSIONALES      ");
        System.out.println("========================================");
        try {
            Esfera esfera = new Esfera(3.0);
            esfera.mostrarInformacion();
            System.out.println("----------------------------------------");

            Cubo cubo = new Cubo(4.0);
            cubo.mostrarInformacion();
            System.out.println("----------------------------------------");

            Cilindro cilindro = new Cilindro(3.0, 5.0);
            cilindro.mostrarInformacion();
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        System.out.println("\n========================================");
        System.out.println("          PRUEBAS DE VALIDACION         ");
        System.out.println("========================================");

        // Prueba 1: Círculo con radio inválido
        System.out.println("Intentando crear un circulo con radio -5...");
        try {
            Circulo circuloInvalido = new Circulo(-5.0);
            circuloInvalido.mostrarInformacion();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Prueba 2: Cuadrado con lado inválido
        System.out.println("Intentando crear un cuadrado con lado -3...");
        try {
            Cuadrado cuadradoInvalido = new Cuadrado(-3.0);
            cuadradoInvalido.mostrarInformacion();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}