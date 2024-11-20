package EjemploVIolacionLSP.Ejemplo2;

    public class Cuadrado extends Rectangulo {
        public Cuadrado(double lado) {
        super(lado, lado);
    }   


    @Override
    public void setAlto(double alto) {
    super.setAlto(alto);
    super.setAncho(alto); // Problema: Cambiar uno afecta al otro.
    }
    
    @Override
    public void setAncho(double ancho) {
    super.setAncho(ancho);
    super.setAlto(ancho); // Problema: Cambiar uno afecta al otro.
    }

}