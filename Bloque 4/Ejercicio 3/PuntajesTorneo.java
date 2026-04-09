public class PuntajesTorneo {
    public static void main(String[] args) {

        // Diccionario Simple: cada usuario tiene un unico puntaje maximo
        DiccionarioSimpleTDA torneo = new DiccionarioSimpleEstatico();
        torneo.InicializarDiccionario();

        // Se registran los puntajes de los jugadores
        torneo.Agregar("Jugador1", 9500);
        System.out.println("Registrado: Jugador1 con puntaje 9500");

        torneo.Agregar("Jugador2", 8750);
        System.out.println("Registrado: Jugador2 con puntaje 8750");

        torneo.Agregar("Jugador3", 9200);
        System.out.println("Registrado: Jugador3 con puntaje 9200");

        // Jugador1 bate su propio record, se actualiza su puntaje
        torneo.Agregar("Jugador1", 9800);
        System.out.println("Jugador1 batio su record! Nuevo puntaje: 9800");

        // Se consultan puntajes
        System.out.println("Puntaje de Jugador1: " + torneo.Recuperar("Jugador1"));
        System.out.println("Puntaje de Jugador2: " + torneo.Recuperar("Jugador2"));

        // Se muestran todos los jugadores
        System.out.println("Jugadores en el torneo:");
        String[] claves = torneo.Claves();
        for (int i = 0; i < claves.length; i++) {
            System.out.println(claves[i] + ": " + torneo.Recuperar(claves[i]));
        }

        // Se elimina un jugador
        torneo.Eliminar("Jugador2");
        System.out.println("Jugador2 eliminado del torneo.");

        System.out.println("Jugadores restantes:");
        String[] claves2 = torneo.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i] + ": " + torneo.Recuperar(claves2[i]));
        }
    }
}
