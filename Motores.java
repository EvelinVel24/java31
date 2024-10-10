class Motores {
    boolean tieneCombustible;
    boolean buenEstado;

    public Motores(boolean tieneCombustible, boolean buenEstado) {
        this.tieneCombustible = tieneCombustible;
        this.buenEstado = buenEstado;
    }

    public void cargarCombustible() {
        if (!tieneCombustible) {
            System.out.println("Cargando combustible...");
            tieneCombustible = true;
        } else {
            System.out.println("---MOTORES---");
            System.out.println("Combustible cargado.");
        }
    }
}
