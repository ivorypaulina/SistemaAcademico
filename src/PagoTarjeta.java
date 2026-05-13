public class PagoTarjeta implements Pagable{
    private final double comision = 2.5;

    @Override
    public void procesarPago(double monto){
        if(monto <=0 ){
            System.out.println("Error: el monto debe ser mayor a cero.");
            return;
        }

        double total = monto + comision;
        System.out.println("Pago con tarjeta realizado");
        System.out.println("Monto original: "+ monto);
        System.out.println("Comisión: $"+ comision);
        System.out.println("Total pagado: $" + total);
    }
}
