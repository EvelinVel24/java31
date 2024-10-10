class Ruedas {
    boolean infladas;
    boolean buenEstado;

    public Ruedas(boolean infladas, boolean buenEstado) {
        this.infladas = infladas;
        this.buenEstado = buenEstado;
    }

    public void inflar() {
        if (!infladas) {
            System.out.println("Inflando ruedas...");
            infladas = true;
        } else {
            System.out.println("---RUEDAS---");
            System.out.println("Ruedas infladas.");
        }
    }
}
