public class EspecatactuloTipoFactory {

    public static Espectaculo crearEspectaculo(String tipo, String titulo, int duracion) {
        switch (tipo.toLowerCase()) {
            case "obra":
                return new ObraTeatro(titulo, duracion);
            case "concierto":
                return new Concierto(titulo, duracion);
            case "standup":
                return new StandUp(titulo, duracion);
            default:
                throw new IllegalArgumentException("Tipo de espectáculo no soportado.");
        }
    }
}
