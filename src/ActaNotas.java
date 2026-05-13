public class ActaNotas implements Imprimible {
    private String carrera;

    public ActaNotas (String carrera){
        this.carrera=carrera;
    }

    @Override
    public void imprimir(){
        System.out.println("Imprimiendo acta de notas.");
        System.out.println("Carrera: "+carrera);

    }

}
