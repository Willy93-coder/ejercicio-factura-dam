public class Facturacion {
    public static void main(String[] args) {
        Factura factura1 = new Factura("21A", 300);
        factura1.calcularFactura(21);
        System.out.println(factura1);
    }
}