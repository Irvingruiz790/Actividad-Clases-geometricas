public class Cuadrado{
    private double lado;

    public Cuadrado(double lado){
        if(lado <= 0){
            throw new IllegalArgumentException("El lado no puede ser menor o igual a 0");
        }

        this.lado = lado;
    }

    public double calcularArea(){
        return lado * lado;
    }

    public double calcularPerimetro(){
        return lado * 4;
    }

    public void mostrarInformacion(){
        System.out.println("--- Cuadrado --- ");
        System.out.println("lado: " + lado);
        System.out.printf("Area: %.2f/n", calcularArea());
        System.out.printf("Perimetro %.2f/n", calcularPerimetro());
    }
}