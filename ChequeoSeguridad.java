public class ChequeoSeguridad {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        PistaAeropuerto pista = new PistaAeropuerto(false);
        Alas alas = new Alas("30 metros", true);
        Motores motores = new Motores(false, true);
        Ruedas ruedas = new Ruedas(false, true);
        Cabina cabina = new Cabina(150, 4, false, true);
        Avion avion = new Avion("Boeing", "737", alas, motores, ruedas, cabina);

        // Chequeo de la pista
        if (!pista.disponible) {
            System.out.println("La pista no está disponible, verificaremos que el avión esté en buenas condiciones.");
        }

        // Chequeo de seguridad del avión
        System.out.println("Realizaremos un chequeo de seguridad.");
        avion.alas.pruebaAlas();
        avion.cabina.cerrarPuertas();
        avion.motores.cargarCombustible();
        avion.ruedas.inflar();

        // Intento de despegue
        avion.listoParaDespegar = true;
        avion.despegar();
    }
}
