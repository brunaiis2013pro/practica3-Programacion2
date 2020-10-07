public class Termino {
   private int idTermino;
   private String palabra;
   private int frecuencia;
   private Documento documento;
   private int numeroDocumentosDistintos;
   private int numeroTotalDocumentos;

    public Termino(int idTermino, String palabra, int frecuencia, Documento documento, int numeroDocumentosDistintos, int numeroTotalDocumentos) {
        this.setIdTermino(idTermino);
        this.setPalabra(palabra);
        this.setFrecuencia(frecuencia);
        this.setDocumento(documento);
        this.setNumeroDocumentosDistintos(numeroDocumentosDistintos);
        this.setNumeroTotalDocumentos(numeroTotalDocumentos);
    }

    public Termino(int idTermino, String palabra, int frecuencia, Documento documento) {
        this.idTermino = idTermino;
        this.palabra = palabra;
        this.frecuencia = frecuencia;
        this.documento = documento;
    }

    public int getIdTermino() {
        return idTermino;
    }

    public void setIdTermino(int idTermino) {
        this.idTermino = idTermino;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public int getNumeroDocumentosDistintos() {
        return numeroDocumentosDistintos;
    }

    public void setNumeroDocumentosDistintos(int numeroDocumentosDistintos) {
        this.numeroDocumentosDistintos = numeroDocumentosDistintos;
    }

    public int getNumeroTotalDocumentos() {
        return numeroTotalDocumentos;
    }

    public void setNumeroTotalDocumentos(int numeroTotalDocumentos) {
        this.numeroTotalDocumentos = numeroTotalDocumentos;
    }
}
