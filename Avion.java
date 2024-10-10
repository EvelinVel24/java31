class Avion {
    String marca;
    String modelo;
    boolean listoParaDespegar;
    Alas alas;
    Motores motores;
    Ruedas ruedas;
    Cabina cabina;

    public Avion(String marca, String modelo, Alas alas, Motores motores, Ruedas ruedas, Cabina cabina) {
        this.marca = marca;
        this.modelo = modelo;
        this.listoParaDespegar = false; // inicialización por defecto
        this.alas = alas;
        this.motores = motores;
        this.ruedas = ruedas;
        this.cabina = cabina;
    }

    public void recibirPasajeros() {
        System.out.println("Pasajeros recibidos.");
    }

    public void despegar() {
        if (listoParaDespegar) {
            System.out.println("El avión está despegando.");
        } else {
            System.out.println("El avión no está listo para despegar.");
        }
    }
}
