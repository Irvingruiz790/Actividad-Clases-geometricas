public class Circulo{
     private double radio;

     public Circulo(double radio){
       if(radio <= 0){ 
        throw new IllegalArgumentException("El radio no puede ser menor o igual a 0");
     }

     this.radio = radio;
     }

    public double calcularPerimetro(){
        return 2 * Math.PI * radio; 
    }
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    public void mostrarInformacion(){
        System.out.println("--- Circulo ---");
        System.out.println("Radio: " + radio);
        System.out.printf("Perimetro: %.2f/n", calcularPerimetro());
        System.
        out.printf("Area: %.2f/n", calcularArea());             
    }
     }
