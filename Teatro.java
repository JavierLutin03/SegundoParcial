public class Teatro {
    private static Teatro instance;
    private String nombre;
    private int asientos_Disponibles;
    private Teatro(String nombre, int asientos_Disponibles) {
        this.nombre = nombre;
        this.asientos_Disponibles = asientos_Disponibles;
    }

    // Método estático para obtener la única instancia
    public static synchronized Teatro getInstance(String nombre, int asientos_Disponibles) {
        if (instance == null) {
            instance = new Teatro(nombre, asientos_Disponibles);
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void reservarAsiento(int cantidad) {
        if (asientosDisponibles >= cantidad) {
            asientosDisponibles -= cantidad;
            System.out.println(cantidad + " asientos reservados.");
        } else {
            System.out.println("No hay asientos disponibles.");
        }
    }
}
