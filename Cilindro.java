public class Cilindro {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        if (radio <= 0 || altura <= 0) {
            throw new IllegalArgumentException("El radio y la altura del cilindro deben ser estrictamente positivos.");
        }
        this.radio = radio;
        this.altura = altura;
    }

    public double calcularSuperficie() {
        return (2 * Math.PI * radio * altura) + (2 * Math.PI * Math.pow(radio, 2));
    }

    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public void mostrarInformacion() {
        System.out.println("Figura: Cilindro");
        System.out.println("Radio: " + radio);
        System.out.println("Altura: " + altura);
        System.out.printf("Superficie: %.2f\n", calcularSuperficie());
        System.out.printf("Volumen: %.2f\n", calcularVolumen());
    }
}