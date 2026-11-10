public class Cubo {
    private double arista;

    public Cubo(double arista) {
        if (arista <= 0) {
            throw new IllegalArgumentException("La arista del cubo debe ser mayor que cero.");
        }
        this.arista = arista;
    }

    public double calcularSuperficie() {
        return 6 * Math.pow(arista, 2);
    }

    public double calcularVolumen() {
        return Math.pow(arista, 3);
    }

    public void mostrarInformacion() {
        System.out.println("Figura: Cubo");
        System.out.println("Arista: " + arista);
        System.out.printf("Superficie: %.2f\n", calcularSuperficie());
        System.out.printf("Volumen: %.2f\n", calcularVolumen());
    }
}
