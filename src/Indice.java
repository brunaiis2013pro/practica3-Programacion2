import java.util.Date;

public class Indice {
    private int idIndice;
    private Date fechaActualizacionDocumento;
    private String hash;

    public Indice(int idIndice, Date fechaActualizacionDocumento, String hash) {
        this.setIdIndice(idIndice);
        this.setFechaActualizacionDocumento(fechaActualizacionDocumento);
        this.setHash(hash);
    }

    public int getIdIndice() {
        return idIndice;
    }

    public void setIdIndice(int idIndice) {
        this.idIndice = idIndice;
    }

    public Date getFechaActualizacionDocumento() {
        return fechaActualizacionDocumento;
    }

    public void setFechaActualizacionDocumento(Date fechaActualizacionDocumento) {
        this.fechaActualizacionDocumento = fechaActualizacionDocumento;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
