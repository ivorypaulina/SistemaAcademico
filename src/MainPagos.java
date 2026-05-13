public class MainPagos {

    public static void main(String[] args) {

        PagoEfectivo efectivo = new PagoEfectivo();
        PagoTarjeta tarjeta = new PagoTarjeta();
        Transferencia transferencia = new Transferencia();

        efectivo.procesarPago(50);
        System.out.println();

        tarjeta.procesarPago(100);
        System.out.println();

        transferencia.procesarPago(200);
    }
}