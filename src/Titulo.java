public class Titulo {
    private int idTitulo;
    private String nombre;
    private String url;

    public Titulo(int idTitulo, String nombre, String url) {
        this.setIdTitulo(idTitulo);
        this.setNombre(nombre);
        this.setUrl(url);
    }

    public int getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(int idTitulo) {
        this.idTitulo = idTitulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
