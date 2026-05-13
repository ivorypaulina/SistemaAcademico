public class HorarioAcademico implements Imprimible{
    private String periodoAcademico;

    public HorarioAcademico(String periodoAcademico){
        this.periodoAcademico=periodoAcademico;
    }

    @Override
    public void imprimir(){
        System.out.println("Imprimiendo horario acádemico");
        System.out.println("Periodo acádemico: "+ periodoAcademico);

    }
}
