package ejemplo.sobreescritura;

/**
 * Clase que contiene metodo main para probar la sobreescritura de metodos
 *
 * @author jamsr
 */
public class PruebaSobreescritura {

    /**
     * Metodo main para crear objetos de tipo Empleado y de tipo Gerente
     *
     * @param args
     */
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 1000); // Accede al constructor de la clase padre
        System.out.println("Empleado: " + empleado.otenerDetalles()); // Accede al metodo original de la clase padre

        Gerente gerente = new Gerente("Karla", 15000, "Ventas"); // Accede al constructor de la subclase
        System.out.println("Gerente: " + gerente.otenerDetalles()); // Accede al metodo sobreescrito

    }

}
