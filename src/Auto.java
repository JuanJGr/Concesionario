public class Auto extends Vehiculo{

    protected int numeroPuertas;

    public Auto(String marca, String modelo, int año, double precioBase, int numeroPuertas) {
        super(marca, modelo, año, precioBase);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de puertas: " + numeroPuertas;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioConImpuesto = precioBase * 1.10;
        double impuesto = precioBase * 0.10;
        double descuento = (numeroPuertas > 3) ? precioConImpuesto * 0.05 : 0;
        double precioFinal = precioConImpuesto - descuento;

        System.out.println("Vehículo: " + marca + " " + modelo);
        System.out.println("Precio Base: $" + precioBase);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Precio Final: $" + precioFinal);

        return precioFinal;
    }

}
