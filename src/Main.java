/*
 * SOURCE: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
 * tip Intellij Idea: CTRL+A abre link en navegador predeterminado.
 *
 */

import java.sql.SQLOutput;

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

        // Probando diferentes métodos de un objeto de tipo String.
        String citaSaramago = "Es una estupidez perder el presente solo por el miedo de no llegar a ganar el futuro. \n";

        System.out.println("----- LONGITUD // LENGTH -----");
        System.out.println(citaSaramago.length());           // INT: Indica la LONGITUD. Obvio que incluye espacios.
        System.out.println(" ");


        System.out.println("----- CONTIENE // CONTAINS -----");
        System.out.println(citaSaramago.contains("miedo"));  // BOOLEAN: Indica si CONTIENE un character o cadena.
        System.out.println(" ");


        System.out.println("----- REPETIR CANTIDAD DE VECES // REPEAT -----");
        System.out.println(citaSaramago.repeat(22));    // REPITE la cadena.
        System.out.println(" ");


        System.out.println("----- MAYUSCULAS-MINUSCULAS // UPPER-LOWER CASE -----");
        String fraseCorta = "La vida es corta";
        System.out.println(fraseCorta.toLowerCase());        // Convierte todos los caracteres a MINÚSCULAS.
        System.out.println(fraseCorta.toUpperCase());        // Convierte todos los caracteres a MAYÚSCULAS.
        System.out.println(" ");


        System.out.println("----- QUITA ESPACIOS // TRIM -----");
        fraseCorta = "       La vida es corta    ";
        System.out.println(fraseCorta);
        System.out.println(fraseCorta.trim());               // Quita espacios en blando delante y atrás.
        fraseCorta = fraseCorta.trim();
        System.out.println(" ");


        System.out.println("----- CARACTER EN POSICION // CHARAT -----");
        System.out.println(fraseCorta.charAt(5));            // Te devuelve que caracter esta en una det posición. Empieza en CERO.
        System.out.println(" ");
        System.out.println("----- OBTENER CLASE // GETCLASS -----");
        System.out.println(fraseCorta.getClass());           // Como es un objeto permite ver de que clase viene.
        System.out.println(" ");


        System.out.println("----- INDEXOF -----");
        System.out.println(fraseCorta.indexOf("es",1));
        System.out.println(" ");


        System.out.println("----- CONCATENADOR // CONCAT -----");
        String calle = "Chacabuco 550 ";
        String ciudad = "Córdoba ";
        String pais = "Argentina ";
        String domicilioCompleto = calle.concat(ciudad).concat(pais);
        System.out.println(domicilioCompleto);
        System.out.println("------------------");
        System.out.println(" ");
    }
}