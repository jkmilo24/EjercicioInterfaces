package pk01;
public class Terrestre extends Vehiculo implements Motor {
    private int llantas;
    private String usoVehiculo;

    public Terrestre(int velocidadActual, int velocidadMaxima, int llantas, String usoVehiculo) {
        super(velocidadActual, velocidadMaxima);
        this.llantas = llantas;
        this.usoVehiculo = usoVehiculo;
    }

    @Override
    public void acelerar(int velocidad) {
        velocidadActual += velocidad;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    @Override
    public void frenar(int velocidad) {
        velocidadActual -= velocidad;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }

    public void imprimirDetalles() {
        imprimir();
        System.out.println("Llantas: " + llantas);
        System.out.println("Uso: " + usoVehiculo);
    }
}

