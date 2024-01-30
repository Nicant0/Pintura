import java.text.DecimalFormat;

public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);

        Rectangulo rectangulo = new Rectangulo(20, 35);
        Esfera esfera = new Esfera(15);
        Cilindro cilindro = new Cilindro(10, 30);

        imprimirCantidadPintura(rectangulo, pintura);
        imprimirCantidadPintura(esfera, pintura);
        imprimirCantidadPintura(cilindro, pintura);
    }

    private static void imprimirCantidadPintura(Forma forma, Pintura pintura) {
        DecimalFormat df = new DecimalFormat("#.##");
        double cantidadPintura = pintura.calcularCantidadPintura(forma);
        System.out.println(forma + " - Cantidad de pintura necesaria: " + df.format(cantidadPintura) + " litros");
    }
}
