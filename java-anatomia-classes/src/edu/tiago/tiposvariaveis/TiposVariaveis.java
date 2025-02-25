package edu.tiago.tiposvariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        System.out.println("Hello Word!");

        /* Variaveis */
        int numero = 5;
        numero = 10;
        System.out.println(numero);

        /* Constante 
         * Precisa colocar o modificador final
         * É declarada com letras maiúsculas
        */
        final double VALOR_PI = 3.14159265359;
        System.out.println("O valor de PI é: " + VALOR_PI);

        //tipos primitivos
        byte b = 127;   // 8 bits
        short s = 32767; // 16 bits
        int i = 2147483647; // 32 bits
        long l = 9223372036854775807L; // 64 bits Terminar com L
        float f = 3.4028235E38f; // 32 bits terminar com f
        double d = 1.7976931348623157E308; // 64 bits
        char c = 'A'; // 16 bits
        boolean bool = true; // 1 bit


        //Classe String
        String nome = "Tiago";
        System.out.println("Olá " + nome);

    }
}
