public class Esfera {
    private double radio;

    public Esfera(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio de la esfera debe ser mayor que cero.");
        }
        this.radio = radio;
    }

    public double calcularSuperficie() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    public void mostrarInformacion() {
        System.out.println("Figura: Esfera");
        System.out.println("Radio: " + radio);
        System.out.printf("Superficie: %.2f\n", calcularSuperficie());
        System.out.printf("Volumen: %.2f\n", calcularVolumen());
    }
}