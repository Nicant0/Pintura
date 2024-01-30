import java.text.DecimalFormat;

class Forma {
    private String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return "Forma: " + nombre;
    }
}

class Esfera extends Forma {
    private double radio;

    public Esfera(double radio) {
        super("Esfera");
        this.radio = radio;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " - Radio: " + radio;
    }
}

class Rectangulo extends Forma {
    private double longitud;
    private double ancho;

    public Rectangulo(double longitud, double ancho) {
        super("Rectángulo");
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return longitud * ancho;
    }

    @Override
    public String toString() {
        return super.toString() + " - Longitud: " + longitud + ", Ancho: " + ancho;
    }
}

class Cilindro extends Forma {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public String toString() {
        return super.toString() + " - Radio: " + radio + ", Altura: " + altura;
    }
}

class Pintura {
    private double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double calcularCantidadPintura(Forma forma) {
        return forma.area() / cobertura;
    }
}

