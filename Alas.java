class Alas {
    String largoEnMetros;
    boolean buenEstado;

    public Alas(String largoEnMetros, boolean buenEstado) {
        this.largoEnMetros = largoEnMetros;
        this.buenEstado = buenEstado;
    }

    public void pruebaAlas() {
        if (buenEstado) {
            System.out.println("---ALAS---");
            System.out.println("Alas listas.");
        } else {
            System.out.println("Alas en mal estado.");
        }
    }
}
