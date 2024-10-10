class Cabina {
    int capacidadPasajeros;
    int numeroPuertas;
    boolean puertasCerradas;
    boolean buenEstado;

    public Cabina(int capacidadPasajeros, int numeroPuertas, boolean puertasCerradas, boolean buenEstado) {
        this.capacidadPasajeros = capacidadPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.puertasCerradas = puertasCerradas;
        this.buenEstado = buenEstado;
    }

    public void cerrarPuertas() {
        if (!puertasCerradas) {
            System.out.println("Cerrando puertas...");
            puertasCerradas = true;
        } else {
            System.out.println("---CABINA---");
            System.out.println("Puertas cerradas.");
        }
    }
}
