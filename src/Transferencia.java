public class Transferencia implements Pegable{
    private final double comision = 1.0;

    @Override
    public void procesarPago(double monto){
        if (monto <= 0){
            System.out.println("Error: el monto debe ser mayor a cero.");
            return;
        }

        double total = monto + comision;
        System.out.println("Transferencia bancaria realizada.");
        System.out.println("Monto original: $" + monto);
        System.out.println("Comisión: $" + comision);
        System.out.println("Total pagado: $"+total);
    }
}
