public class Documento {
    private int idDocumento;
    private int numeroRegistro;
    private Tema tema;
    private Titulo titulo;
    private String letraClave;
    private Indice indice;
    private Double tamanioBytes;

    public Documento(int idDocumento, int numeroRegistro, Tema tema, Titulo titulo, String letraClave, Double tamanioBytes) {
        this.setIdDocumento(idDocumento);
        this.setNumeroRegistro(numeroRegistro);
        this.setTema(tema);
        this.setTitulo(titulo);
        this.setLetraClave(letraClave);
        this.setTamanioBytes(tamanioBytes);
    }

    public Documento(int idDocumento, int numeroRegistro, Tema tema, Titulo titulo, String letraClave, Indice indice, Double tamanioBytes) {
        this.idDocumento = idDocumento;
        this.numeroRegistro = numeroRegistro;
        this.tema = tema;
        this.titulo = titulo;
        this.letraClave = letraClave;
        this.indice = indice;
        this.tamanioBytes = tamanioBytes;
    }

    public Indice getIndice() {
        return indice;
    }

    public void setIndice(Indice indice) {
        this.indice = indice;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public String getLetraClave() {
        return letraClave;
    }

    public void setLetraClave(String letraClave) {
        this.letraClave = letraClave;
    }

    public Double getTamanioBytes() {
        return tamanioBytes;
    }

    public void setTamanioBytes(Double tamanioBytes) {
        this.tamanioBytes = tamanioBytes;
    }
}
