package ejercicioUno;

public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(8, 6);

        System.out.println("El área del circulo es: " + circulo.calcularArea());
        System.out.println("El área del rectangulo es: " + rectangulo.calcularArea());

    }
}
