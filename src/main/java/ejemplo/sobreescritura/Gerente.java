package ejemplo.sobreescritura;

/**
 * Subclase de la Clase Empleado
 *
 * @author jamsr
 */
public class Gerente extends Empleado {

    private String departamento;

    /**
     * Constructor con tres argumentos que inicializa los argumentos de la Clase
     * Empleado desde su constructor, mediante SUPER e inicializa el atributo de
     * la Clase Gerente
     *
     * @param nombre String
     * @param sueldo double
     * @param departamento String
     */
    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo); // Llamada al constructor de Empleado
        this.departamento = departamento;
    }

    /**
     * Metodo que sobreescribe el metodo obtenerDetalles de la clase Empleado
     *
     * @return String nombre, double sueldo, String departamento
     */
    @Override //Sobreescritura del metodo padre heredado
    public String otenerDetalles() {
        return "nombre: " + nombre + " --> sueldo $" + sueldo + " --> Departamento --> " + departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
