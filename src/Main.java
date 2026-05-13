public class Main {
    public static void main (String[] args){

        Certificado certificado = new Certificado("D001");
        ActaNotas acta = new ActaNotas("Ingeniería en Software");
        HorarioAcademico horario = new HorarioAcademico("2026-A");

        certificado.imprimir();
        System.out.println();

        acta.imprimir();
        System.out.println();

        horario.imprimir();
    }
}