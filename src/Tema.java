public class Tema {
    private int idTema;
    private Tema supertema;
    private String nombre;

    public Tema(int idTema, Tema supertema, String nombre) {
        this.setIdTema(idTema);
        this.setSupertema(supertema);
        this.setNombre(nombre);
    }


    //Sobrecarga de constructores
    public Tema(int idTema, String nombre) {
        this.setIdTema(idTema);
        this.setNombre(nombre);
    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public Tema getSupertema() {
        return supertema;
    }

    public void setSupertema(Tema supertema) {
        this.supertema = supertema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
