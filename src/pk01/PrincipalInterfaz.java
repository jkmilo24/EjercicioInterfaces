package pk01;
public class PrincipalInterfaz {
public static void main(String[] args) {
        System.out.println("=== Camioneta ===");
        Terrestre camioneta = new Terrestre(50, 120, 4, "civil");
        camioneta.imprimirDetalles();
        camioneta.acelerar(30);
        camioneta.frenar(20);
        System.out.println("Revoluciones motor: " + camioneta.calcularRevolucionesMotor(100, 5));
        camioneta.imprimir();
        System.out.println("\n=== Moto Acuática ===");
        Acuatico motoAcuatica = new Acuatico(50, 110, "superficie", 2);
        motoAcuatica.imprimirDetalles();
        motoAcuatica.acelerar(40);
        motoAcuatica.frenar(10);
        motoAcuatica.recomendarVelocidad(85); 
        motoAcuatica.imprimir();
    }
}
