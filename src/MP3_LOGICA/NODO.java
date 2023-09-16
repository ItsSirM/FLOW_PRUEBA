package MP3_LOGICA;

public class NODO {
    
    String nombre, direccion;
    NODO siguiente;
    NODO anterior;

    public NODO(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
}
