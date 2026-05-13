public class Certificado implements Imprimible{
    //atributos
    private String numeroDocumento;

    public Certificado(String numeroDocumento){
        this.numeroDocumento=numeroDocumento;
    }

    @Override
    public void imprimir(){
        System.out.println("Imprimiendo certificado acádemico.");
        System.out.println("Número de documento: "+numeroDocumento);
    }
}
