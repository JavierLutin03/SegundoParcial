public class ObraTeatro extends Espectaculo {
    public ObraTeatro(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Obra de teatro: " + titulo + " - Duración: " + duracion + " minutos.");
    }
}

public class Concierto extends Espectaculo {
    public Concierto(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Concierto: " + titulo + " - Duración: " + duracion + " minutos.");
    }
}

public class StandUp extends Espectaculo {
    public StandUp(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Stand-up: " + titulo + " - Duración: " + duracion + " minutos.");
    }
}
