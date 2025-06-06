public class ProcesadorDePagos {
    private MetodoPago metodoPago;

    public ProcesadorDePagos(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void procesar(double monto) {
        metodoPago.procesarPago(monto);
    }
}