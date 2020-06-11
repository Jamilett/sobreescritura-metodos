package ejemplo.sobreescritura;

/**
 * Clase PADRE que contiene atributos y un constructor protected, un metodo
 * publico para obtener detalles y getters & setters
 *
 * @author jamsr
 */
public class Empleado {

    protected String nombre;
    protected double sueldo;

    /**
     * Constructor con dos argumentos, inicializa los valores de los atributos
     * de la Clase Empleado
     *
     * @param nombre String
     * @param sueldo int
     */
    protected Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    /**
     * Metodo obtenerDetalles de la Clase Empleado
     *
     * @return String nombre, double sueldo
     */
    public String otenerDetalles() {
        return "nombre: " + nombre + " --> sueldo $" + sueldo;
    }

    /**
     * Metodo getNombre
     *
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setNombre
     *
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo getSueldo
     *
     * @return double sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Metodo setSueldo
     *
     * @param sueldo double
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
