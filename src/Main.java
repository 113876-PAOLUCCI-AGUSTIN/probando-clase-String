public class Main {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello World";

        // Es VERDADERO porque ambas apuntan al mismo espacio en memoria mediante String Pool.
        if (s1 == s2) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }

        // Creo una cadena con NEW, no aplica el STRING POOL, sino que es un objeto separado en HEAP DE MEMORIA.
        // Java aquí crea una NUEVA INSTANCIA DE STRING.
        String s3 = new String("Hello World");
        if (s1 == s3) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso"); // es falso porque Java asignó a un espacio nuevo.
        }

        if (s1.equals(s3)) {
            System.out.println("Son IGUALES");
        } else {
            System.out.println("Son DISTINTAS");
        }
        /* Esto es VERDADERO, E INDICA IGUALES PORQUE EQUALS COMPARA CONTENIDO DE LA MEMORIA!!!!!!!!
         * independientemente de si el objeto fue creado con "" o con NEW.
         */
    }
}