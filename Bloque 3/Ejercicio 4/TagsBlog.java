public class TagsBlog {
    public static void main(String[] args) {

        // Un conjunto no admite duplicados ni tiene orden, ideal para tags
        ConjuntoTDA tags = new ConjuntoEstatico();
        tags.InicializarConjunto();

        // Se agregan los tags del post
        tags.Agregar("#Programacion");
        System.out.println("Tag agregado: #Programacion");

        tags.Agregar("#Java");
        System.out.println("Tag agregado: #Java");

        tags.Agregar("#OOP");
        System.out.println("Tag agregado: #OOP");

        // Se intenta agregar un tag repetido, el conjunto lo ignora
        tags.Agregar("#Java");
        System.out.println("Se intento agregar #Java de nuevo...");

        // Se verifica si los tags existen
        System.out.println("¿Pertenece #Java?: " + tags.Pertenece("#Java"));
        System.out.println("¿Pertenece #Python?: " + tags.Pertenece("#Python"));

        // Un tag elegido al azar del conjunto
        System.out.println("Tag elegido: " + tags.Elegir());

        // Se elimina un tag
        tags.Sacar("#OOP");
        System.out.println("¿Pertenece #OOP luego de sacarlo?: " + tags.Pertenece("#OOP"));

        System.out.println("¿Conjunto vacio?: " + tags.ConjuntoVacio());
    }
}
