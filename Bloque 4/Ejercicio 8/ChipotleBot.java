public class ChipotleBot {
    public static void main(String[] args) {

        // Diccionario Simple: cada orden tiene un unico script asociado
        DiccionarioSimpleTDA bot = new DiccionarioSimpleEstatico();
        bot.InicializarDiccionario();

        // Se registran las ordenes con sus scripts
        bot.Agregar(1001, "script_reiniciar_servidor.py");
        System.out.println("Orden 1001 registrada.");

        bot.Agregar(1002, "script_reembolso.py");
        System.out.println("Orden 1002 registrada.");

        bot.Agregar(1003, "script_cambiar_pedido.py");
        System.out.println("Orden 1003 registrada.");

        // El bot consulta el script para resolver una orden
        System.out.println("Script para orden 1001: " + bot.Recuperar(1001));
        System.out.println("Script para orden 1002: " + bot.Recuperar(1002));

        // Se actualiza el script de una orden
        bot.Agregar(1001, "script_reiniciar_servidor_v2.py");
        System.out.println("Script de orden 1001 actualizado.");
        System.out.println("Nuevo script para orden 1001: " + bot.Recuperar(1001));

        // Se elimina una orden resuelta
        bot.Eliminar(1002);
        System.out.println("Orden 1002 resuelta y eliminada.");

        // Se muestran las ordenes pendientes
        System.out.println("Ordenes pendientes:");
        int[] claves = bot.Claves();
        for (int i = 0; i < claves.length; i++) {
            System.out.println("Orden " + claves[i] + ": " + bot.Recuperar(claves[i]));
        }
    }
}
