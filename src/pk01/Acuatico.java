package pk01;

public class Acuatico extends Vehiculo implements Vela {
    private String tipo;
    private int capacidadPasajeros;
    public Acuatico(int velocidadActual, int velocidadMaxima, String tipo, int capacidadPasajeros) {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
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
    public int recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            velocidadActual = 0;
            System.out.println("Viento muy fuerte, no se recomienda salir.");
        } else if (velocidadViento < 10) {
            System.out.println("Viento muy débil, no se recomienda salir.");
        } else {
            System.out.println("Condiciones óptimas para navegar.");
        }
        return velocidadActual;
    }
    public void imprimirDetalles() {
        imprimir();
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad de Pasajeros: " + capacidadPasajeros);
    }
}
