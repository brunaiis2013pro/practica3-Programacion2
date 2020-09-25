public class Cantidad {
   private int idCantidad;
   private int numeroDocumentosDistintos;
   private int totalDocumentos;
   private int totalPalabras;
   private int palabrasDistintas;

    public Cantidad(int idCantidad, int numeroDocumentosDistintos, int totalDocumentos, int totalPalabras, int palabrasDistintas) {
        this.setIdCantidad(idCantidad);
        this.setNumeroDocumentosDistintos(numeroDocumentosDistintos);
        this.setTotalDocumentos(totalDocumentos);
        this.setTotalPalabras(totalPalabras);
        this.setPalabrasDistintas(palabrasDistintas);
    }


    public Cantidad(int totalPalabras, int palabrasDistintas) {
        this.totalPalabras = totalPalabras;
        this.palabrasDistintas = palabrasDistintas;
    }

    public int getIdCantidad() {
        return idCantidad;
    }

    public void setIdCantidad(int idCantidad) {
        this.idCantidad = idCantidad;
    }

    public int getNumeroDocumentosDistintos() {
        return numeroDocumentosDistintos;
    }

    public void setNumeroDocumentosDistintos(int numeroDocumentosDistintos) {
        this.numeroDocumentosDistintos = numeroDocumentosDistintos;
    }

    public int getTotalDocumentos() {
        return totalDocumentos;
    }

    public void setTotalDocumentos(int totalDocumentos) {
        this.totalDocumentos = totalDocumentos;
    }

    public int getTotalPalabras() {
        return totalPalabras;
    }

    public void setTotalPalabras(int totalPalabras) {
        this.totalPalabras = totalPalabras;
    }

    public int getPalabrasDistintas() {
        return palabrasDistintas;
    }

    public void setPalabrasDistintas(int palabrasDistintas) {
        this.palabrasDistintas = palabrasDistintas;
    }
}
