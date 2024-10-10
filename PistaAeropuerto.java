class PistaAeropuerto {
    boolean disponible;

    public PistaAeropuerto(boolean disponible) {
        this.disponible = disponible;
    }

    public void actualizarDisponibilidad(boolean nuevaDisponibilidad) {
        disponible = nuevaDisponibilidad;
    }
}
