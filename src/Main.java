public class Main {
    public static void main(String[] args) {
        ProcesadorDePagos pago = new ProcesadorDePagos(new PagoPayPal());
        pago.procesar(49.99);

        pago.setMetodoPago(new PagoTarjeta());
        pago.procesar(79.99);
    }
}