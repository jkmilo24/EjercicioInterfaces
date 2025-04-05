package pk01;
public class Terrestre extends Vehiculo {
    public Terrestre(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
}

