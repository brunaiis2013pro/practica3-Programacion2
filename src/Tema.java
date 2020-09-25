public class Tema {
    private int idTema;
    private Tema subtema;
    private String nombre;

    public Tema(int idTema, Tema subtema, String nombre) {
        this.setIdTema(idTema);
        this.setSubtema(subtema);
        this.setNombre(nombre);
    }
    //Sobrecarga de constructores
    public Tema(int idTema, String nombre) {
        this.idTema = idTema;
        this.nombre = nombre;
    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public Tema getSubtema() {
        return subtema;
    }

    public void setSubtema(Tema subtema) {
        this.subtema = subtema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
