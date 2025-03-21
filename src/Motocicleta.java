public class Motocicleta extends Vehiculo {

    protected int cilindrada;

    public Motocicleta(String marca, String modelo, int año, double precioBase, int cilindrada) {
        super(marca, modelo, año, precioBase);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindrada: " + cilindrada + "cc";
    }

    @Override
    public double calcularPrecioFinal() {
        double precioConImpuesto = precioBase * 1.10;
        double impuesto = precioBase * 0.10;
        double descuento = (cilindrada > 500) ? precioConImpuesto * 0.03 : 0;
        double precioFinal = precioConImpuesto - descuento;

        System.out.println("Vehículo: " + marca + " " + modelo);
        System.out.println("Precio Base: $" + precioBase);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Precio Final: $" + precioFinal);

        return precioFinal;
    }
}
