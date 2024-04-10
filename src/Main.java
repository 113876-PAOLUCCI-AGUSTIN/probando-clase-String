/*
 * Multiple sources:
 * OFFICIAL DOCS: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
 * MY SOURCE TOO: https://www.crio.do/blog/string-methods-in-java/ <<< EXCELLENT!
 *                https://www.linkedin.com/pulse/java-strings-string-pool-muhammad-noman
 */

import java.util.Arrays;

public class Main {
    public static <Char> void main(String[] args) {
        /*
         * Los objetos STRING en Java pueden ser creados de dos maneras:
         * String literal: se crean con comilla doble.
         * Usando la palabra clave new.
         */

        String grt01 = "Bienvenidos";
        /* Esto crea un string en la Java String Pool, un lugar especial dentro de la memoria HEAP.
         * También se la llama String Constant Pool or String Intern Pool.
         * Las cadenas en Java son inmutables, lo que significa que una vez que se crea un objeto
         * de cadena, su valor no se puede cambiar.
         */
        String grt02 = new String("Hola");

        // Chequeando que tipo de string son.
        String s1 = "Hello World";
        String s2 = "Hello World";

        if (s1 == s2) {
            System.out.println("Verdadero"); // True porque ambas apuntan al mismo espacio en memoria.
        } else {
            System.out.println("Falso");
        }

        // Creo una cadena con NEW, no aplica el STRING POOL, sino que es un objeto separado en HEAP DE MEMORIA.
        // Java aquí crea una NUEVA INSTANCIA DE STRING.
        String s3 = new String("Hello World");
        if (s1 == s3) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso"); // ES FALSO porque Java asignó a un espacio nuevo.
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
        String javaJoke = "Why do Java developers wear glasses? Because they can't C#.";


        // TOP TEN METHODS.
        // 1 - indexOf()
        System.out.println("----- indexOf -----");
        // e.g.: javaJoke "Why do Java developers wear glasses? Because they can't C#.\n"
        System.out.println(javaJoke.indexOf("wear",0));     // Empieza en cero y llega lo encuentra en 23.
        System.out.println(javaJoke.indexOf("clothes",0)); // devuelve -1 sino
        System.out.println(" ");

        // 2 - toCharArray()
        // e.g.: javaJoke "Why do Java developers wear glasses? Because they can't C#.\n"
        System.out.println("----- toCharArray -----");
        char[] javaJokeArray = javaJoke.toCharArray();
        for (int i = 0; i < javaJokeArray.length; i++) {
            System.out.println(javaJokeArray[i]);
        }

        // 3 - charAt()
        // e.g.: javaJoke "Why do Java developers wear glasses? Because they can't C#.\n"
        System.out.println("----- carater en una posicion // charAt-----");
        System.out.println(javaJoke.charAt(13));            // Te devuelve caracter de una det posición. Empieza en CERO
        System.out.println(" ");

        // 4 - charAt()
        // e.g.: javaJoke "Why do Java developers wear glasses? Because they can't C#.\n"
        System.out.println("----- CONCATENADOR // CONCAT -----");
        String javaJoke01 = "Why do Java developers";
        String javaJoke02 = " wear glasses? ";
        String javaJoke03 = "Because they can't C#.\n";
        String javaJokeCompleted = javaJoke01.concat(javaJoke02).concat(javaJoke03);
        System.out.println(javaJokeCompleted);
        System.out.println(" ");

        // 5 - replace()
        // e.g.: javaJoke "Why do Java developers wear glasses? Because they can't C#.\n"
        System.out.println("----- reemplazar // replace -----");
        System.out.println(javaJoke.replace('s','x')); // CUIDADO: CASE SENSITIVE!!!!!
        System.out.println(javaJoke.replace('e','Z'));
        System.out.println(javaJoke);
        System.out.println(" ");

        // 6 - substring()
        // e.g.: javaJoke "Why do Java developers wear glasses? Because they can't C#.\n"
        System.out.println("----- sacar subcadena // substring -----");
        System.out.println(javaJoke.substring(7,35)); // IMPORTANTE endindex-1!!!!!!!
        System.out.println(" ");


        // 7 - split()
        // e.g.: javaJoke "Why do Java developers wear glasses? Because they can't C#.\n"
        System.out.println("----- dividir // split -----");
        String[] arrayOfJavaJoke = javaJoke.split(" "); // arma un array a partir de partir una "EXPRESION REGULAR".
        for (int i = 0; i < arrayOfJavaJoke.length; i++) {
            System.out.println(arrayOfJavaJoke[i]);
        }
        System.out.println(arrayOfJavaJoke.length); // Podría contar la cantidad de palabras.
        System.out.println(" ");

        String fechaDeNacimiento = "02/09/1975";
        String[] extraccionAnio = fechaDeNacimiento.split("02/09/"); // encuentra el patron y CORTA
        System.out.println(extraccionAnio[1]); // armando un array de X partes.
        System.out.println(" ");


        // 8 - compareTo()
        // e.g.: javaJoke "Why do Java developers wear glasses? Because they can't C#.\n"
        System.out.println("----- comparar con // compareTo -----");
        javaJoke.compareTo("Java");


        // 9 - strip()
        // e.g.: javaJoke "Why do Java developers wear glasses? Because they can't C#.\n"
        System.out.println("----- comparar con // compareTo -----");

        // 10 - valueOf
        // contains /isEmpty / join / repeat /starsWith/tolower to upper/indent

        String javaJoke2 = "Why do Java developers wear glasses? Because they can't C#.";
        char[] jJCA = javaJoke2.toCharArray();

        for (int i = 0; i < jJCA.length; i++) {
            System.out.println(jJCA[i]);

        }
        for (int i = jJCA.length - 1; i >= 0; i--) {
            System.out.print(jJCA[i]);
        }

        String name = "Agustin";
        char[] agustinArray = name.toCharArray();
        for (int i = 0; i < agustinArray.length; i++) {
            char c = agustinArray[i];
            System.out.print(c+" ");
        }
        for (int i = agustinArray.length - 1; i >= 0; i--) {
            char c = agustinArray[i];
            System.out.print(c+" ");
        }

        // CTRL+J fori FOR // itar FOR de un array
       /*
       * iter    Iterate (for each..in)
         itin    Iterate (for..in)
         itli    Iterate over a List
         //itar    Iterate elements of array
         //ritar   Iterate elements of array in reverse order
         * */


        System.out.println("----- LONGITUD // LENGTH -----");
        System.out.println(javaJoke.length());           // INT: Indica la LONGITUD. Obvio que incluye espacios.
        System.out.println(" ");


        System.out.println("----- CONTIENE // CONTAINS -----");
        System.out.println(javaJoke.contains("miedo"));  // BOOLEAN: Indica si CONTIENE un character o cadena.
        System.out.println(javaJoke.contains("C#"));     // TRUE.
        System.out.println(" ");


        System.out.println("----- REPETIR CANTIDAD DE VECES // REPEAT -----");
        System.out.println(javaJoke.repeat(9));    // REPITE la cadena.
        System.out.println(" ");


        System.out.println("----- MAYUSCULAS-MINUSCULAS // UPPER-LOWER CASE -----");
        System.out.println(javaJoke.toLowerCase());      // Convierte todos los caracteres a MINÚSCULAS.
        System.out.println(javaJoke.toUpperCase());      // Convierte todos los caracteres a MAYÚSCULAS.
        System.out.println(" ");


        System.out.println("----- QUITA ESPACIOS // TRIM -----");
        javaJoke = "           Why do Java developers wear glasses? Because they can't C#.\n";
        System.out.println(javaJoke);
        System.out.println(javaJoke.trim());             // Quita espacios en blanco adelante y atrás.
        javaJoke = javaJoke.trim();
        System.out.println(javaJoke);
        System.out.println(" ");




        // Ex: "Why do Java developers wear glasses? Because they can't C#.\n"
        System.out.println("----- INDEXOF -----");
        System.out.println(javaJoke.indexOf("Java",1));
        System.out.println(" ");


        System.out.println("----- OBTENER CLASE // GETCLASS -----");
        System.out.println(javaJoke.getClass());           // Como es un objeto permite ver de que clase viene.
        System.out.println(" ");


        System.out.println("----- CONCATENADOR // CONCAT -----");
        String calle = "Chacabuco 550 ";
        String ciudad = "Córdoba ";
        String pais = "Argentina ";
        String domicilioCompleto = calle.concat(ciudad).concat(pais);
        System.out.println(domicilioCompleto);
        System.out.println("---------------------------------");
        System.out.println(" ");
    }
}
