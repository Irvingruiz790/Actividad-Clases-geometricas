public class Rectangulo{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        if(base <= 0 || altura <= 0){
            throw new IllegalArgumentException("la base o la altura no pueden ser menores o iguales a 0");
        }

        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return (base * altura) / 2;
    }

    public double calcularPerimetro(){
        return base*2 + altura*2 ;
    }

    public void mostrarInformacion(){
        System.out.println("--- Rectangulo --- ");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.printf("Area: %.2f/n", calcularArea());
        System.out.printf("Perimetro %.2f/n", calcularPerimetro());
    }
}