
package domain;

public class Pais {
    private String nombre;
    private String codigoIso;

    public Pais(String nombre, String codigoIso) {
        this.nombre = nombre;
        this.codigoIso = codigoIso;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoIso() {
        return codigoIso;
    }
    
    
}
