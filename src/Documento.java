import java.util.Date;

public class Documento {
    private int idDocumento;
    private int numeroRegistro;
    private Tema tema;
    private String titulo;
    private String letraClave;
    private Double tamanioBytes;
    private String url;
    private String hash;
    private int tamanioPalabras;
    private int numeroPalabrasDiferentes;
    private Date fechaActualizacion;

    public Documento(int idDocumento, int numeroRegistro, Tema tema, String titulo, String letraClave, Double tamanioBytes, String url, String hash, int tamanioPalabras, int numeroPalabrasDiferentes, Date fechaActualizacion) {
        this.idDocumento = idDocumento;
        this.numeroRegistro = numeroRegistro;
        this.tema = tema;
        this.titulo = titulo;
        this.letraClave = letraClave;
        this.tamanioBytes = tamanioBytes;
        this.url = url;
        this.hash = hash;
        this.tamanioPalabras = tamanioPalabras;
        this.numeroPalabrasDiferentes = numeroPalabrasDiferentes;
        this.fechaActualizacion = fechaActualizacion;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getTamanioPalabras() {
        return tamanioPalabras;
    }

    public void setTamanioPalabras(int tamanioPalabras) {
        this.tamanioPalabras = tamanioPalabras;
    }

    public int getNumeroPalabrasDiferentes() {
        return numeroPalabrasDiferentes;
    }

    public void setNumeroPalabrasDiferentes(int numeroPalabrasDiferentes) {
        this.numeroPalabrasDiferentes = numeroPalabrasDiferentes;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
