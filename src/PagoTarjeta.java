public class PagoTarjeta implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("💳 Procesando pago de $" + monto + " con Tarjeta de Crédito.");
    }
}