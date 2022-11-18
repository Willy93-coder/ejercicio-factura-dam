public class Factura {
    // Atributos
    private String codigo_factura;
    private double valor_factura;

    // Constructores
    public Factura() {
    }

    public Factura(String factura, double valor_factura) {
        this.codigo_factura = factura;
        this.valor_factura = valor_factura;
    }

    // Getters y Setters
    public String getFactura() {
        return codigo_factura;
    }

    public void setFactura(String factura) {
        this.codigo_factura = factura;
    }

    public double getValor_factura() {
        return valor_factura;
    }

    public void setValor_factura(double valor_factura) {
        this.valor_factura = valor_factura;
    }

    // Métodos
    public double calcularFactura(double IVA) {
        double total_factura;
        double calcularIvaPorcentaje = IVA / 100;
        total_factura = (valor_factura * calcularIvaPorcentaje) + valor_factura;
        return this.valor_factura = total_factura;
    }

    @Override
    public String toString() {
        return "Tu factura con código " + codigo_factura + ", tiene un valor total con IVA de: " + valor_factura;
    }
}
